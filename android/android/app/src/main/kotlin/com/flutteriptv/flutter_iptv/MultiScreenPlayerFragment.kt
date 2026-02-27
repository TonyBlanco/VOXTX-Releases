package com.flutteriptv.flutter_iptv

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Color
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.KeyEvent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.media3.common.MediaItem
import androidx.media3.common.PlaybackException
import androidx.media3.common.Player
import androidx.media3.common.VideoSize
import androidx.media3.exoplayer.DefaultLoadControl
import androidx.media3.exoplayer.DefaultRenderersFactory
import androidx.media3.exoplayer.ExoPlayer
import androidx.media3.exoplayer.source.DefaultMediaSourceFactory
import androidx.media3.datasource.DefaultHttpDataSource
import androidx.media3.ui.PlayerView
import java.net.URL
import java.util.concurrent.Executors
import kotlin.math.pow

/**
 * Multi-screen player fragment with Windows-style split-screen navigation:
 * 1. Arrow keys move focus between screens.
 * 2. OK opens the channel selector when the screen is empty or makes it active.
 * 3. Long OK clears the current screen.
 * 4. Back exits splitscreen back to the single-player view.
 * 5. Volume boost is supported.
 */
class MultiScreenPlayerFragment : Fragment() {
    private val TAG = "MultiScreenPlayer"

    // Four player instances
    private val players = arrayOfNulls<ExoPlayer>(4)
    private val playerViews = arrayOfNulls<PlayerView>(4)
    private val screenContainers = arrayOfNulls<View>(4)
    private val overlays = arrayOfNulls<View>(4)

    // Screen states
    data class ScreenState(
        var channelIndex: Int = -1,
        var channelName: String = "",
        var channelUrl: String = "",
        var isLoading: Boolean = false,
        var hasError: Boolean = false,
        var videoWidth: Int = 0,
        var videoHeight: Int = 0,
        var retryCount: Int = 0,  // Retry counter
        var currentSourceIndex: Int = 0  // Current source index
    )
    private val screenStates = Array(4) { ScreenState() }
    
    // Retry-related constants
    private val MAX_RETRIES = 3
    private val RETRY_DELAY = 2000L

    // Focused and active screens
    private var focusedScreenIndex = 0
    private var activeScreenIndex = 0

    // Control bar
    private lateinit var topBar: View
    private lateinit var bottomBar: View
    private var controlsVisible = true

    // Channel selector
    private lateinit var channelSelectorPanel: View
    private lateinit var categoryList: RecyclerView
    private lateinit var channelGrid: RecyclerView
    private lateinit var selectorScreenTitle: TextView
    private lateinit var selectorCategoryTitle: TextView
    private lateinit var selectorChannelCount: TextView
    private var channelSelectorVisible = false
    private var targetScreenForSelector = 0
    private var selectedCategoryIndex = 0  // 0 = all channels
    private var categoryFocusIndex = 0
    private var channelFocusIndex = 0
    private var isCategoryFocused = true  // true = category list has focus, false = channel grid

    // Channel data
    private var channelUrls = arrayListOf<String>()
    private var channelNames = arrayListOf<String>()
    private var channelGroups = arrayListOf<String>()
    private var channelSources = arrayListOf<ArrayList<String>>()
    private var channelLogos = arrayListOf<String>()
    
    // Category data
    private var categories = arrayListOf<String>()
    private var categoryChannelCounts = hashMapOf<String, Int>()
    
    // Initial channel index (from channel list entry)
    private var initialChannelIndex = 0
    // Initial source index (from single player transition)
    private var initialSourceIndex = 0
    
    // Default screen position (1-4)
    private var defaultScreenPosition = 1
    
    // Volume boost
    private var volumeBoostDb = 0
    private var baseVolume = 1.0f
    
    // Whether to show channel names
    private var showChannelName = false

    // Handler
    private val handler = Handler(Looper.getMainLooper())
    private var hideControlsRunnable: Runnable? = null
    private val CONTROLS_HIDE_DELAY = 4000L
    
    // Long press detection
    private var okKeyDownTime = 0L
    private val LONG_PRESS_THRESHOLD = 500L
    private var longPressHandled = false
    private var ignoreInitialKeyEvents = true  // Ignore initial key events
    private var initTime = 0L  // Initialization timestamp

    var onCloseListener: (() -> Unit)? = null
    var onExitToNormalPlayer: ((Int, Int) -> Unit)? = null

    companion object {
        private const val ARG_CHANNEL_URLS = "channel_urls"
        private const val ARG_CHANNEL_NAMES = "channel_names"
        private const val ARG_CHANNEL_GROUPS = "channel_groups"
        private const val ARG_CHANNEL_SOURCES = "channel_sources"
        private const val ARG_CHANNEL_LOGOS = "channel_logos"
        private const val ARG_INITIAL_CHANNEL_INDEX = "initial_channel_index"
        private const val ARG_INITIAL_SOURCE_INDEX = "initial_source_index"
        private const val ARG_VOLUME_BOOST_DB = "volume_boost_db"
        private const val ARG_DEFAULT_SCREEN_POSITION = "default_screen_position"
        private const val ARG_RESTORE_ACTIVE_INDEX = "restore_active_index"
        private const val ARG_RESTORE_FOCUSED_INDEX = "restore_focused_index"
        private const val ARG_RESTORE_SCREEN_STATES = "restore_screen_states"
        private const val ARG_SHOW_CHANNEL_NAME = "show_channel_name"
        
        private val imageCache = hashMapOf<String, Bitmap?>()
        private val loadingUrls = hashSetOf<String>()

        fun newInstance(
            channelUrls: ArrayList<String>,
            channelNames: ArrayList<String>,
            channelGroups: ArrayList<String>,
            channelSources: ArrayList<ArrayList<String>>,
            channelLogos: ArrayList<String>,
            initialChannelIndex: Int = 0,
            initialSourceIndex: Int = 0,
            volumeBoostDb: Int = 0,
            defaultScreenPosition: Int = 1,
            restoreActiveIndex: Int = -1,
            restoreFocusedIndex: Int = -1,
            restoreScreenStates: ArrayList<ArrayList<String>>? = null,
            showChannelName: Boolean = false
        ): MultiScreenPlayerFragment {
            return MultiScreenPlayerFragment().apply {
                arguments = Bundle().apply {
                    putStringArrayList(ARG_CHANNEL_URLS, channelUrls)
                    putStringArrayList(ARG_CHANNEL_NAMES, channelNames)
                    putStringArrayList(ARG_CHANNEL_GROUPS, channelGroups)
                    putSerializable(ARG_CHANNEL_SOURCES, channelSources)
                    putStringArrayList(ARG_CHANNEL_LOGOS, channelLogos)
                    putInt(ARG_INITIAL_CHANNEL_INDEX, initialChannelIndex)
                    putInt(ARG_INITIAL_SOURCE_INDEX, initialSourceIndex)
                    putInt(ARG_VOLUME_BOOST_DB, volumeBoostDb)
                    putInt(ARG_DEFAULT_SCREEN_POSITION, defaultScreenPosition)
                    putInt(ARG_RESTORE_ACTIVE_INDEX, restoreActiveIndex)
                    putInt(ARG_RESTORE_FOCUSED_INDEX, restoreFocusedIndex)
                    restoreScreenStates?.let { putSerializable(ARG_RESTORE_SCREEN_STATES, it) }
                    putBoolean(ARG_SHOW_CHANNEL_NAME, showChannelName)
                }
            }
        }
    }
    
    fun getScreenState(index: Int): ScreenState? {
        return if (index in 0..3) screenStates[index] else null
    }
    
    fun getActiveScreenIndex(): Int = activeScreenIndex
    fun getFocusedScreenIndex(): Int = focusedScreenIndex

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_multi_screen_player, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d(TAG, "onViewCreated")
        
        initTime = System.currentTimeMillis()
        ignoreInitialKeyEvents = true

        activity?.window?.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)

        var restoreActiveIndex = -1
        var restoreFocusedIndex = -1
        var restoreScreenStates: ArrayList<ArrayList<String>>? = null
        
        arguments?.let {
            channelUrls = it.getStringArrayList(ARG_CHANNEL_URLS) ?: arrayListOf()
            channelNames = it.getStringArrayList(ARG_CHANNEL_NAMES) ?: arrayListOf()
            channelGroups = it.getStringArrayList(ARG_CHANNEL_GROUPS) ?: arrayListOf()
            @Suppress("UNCHECKED_CAST")
            channelSources = it.getSerializable(ARG_CHANNEL_SOURCES) as? ArrayList<ArrayList<String>> ?: arrayListOf()
            channelLogos = it.getStringArrayList(ARG_CHANNEL_LOGOS) ?: arrayListOf()
            initialChannelIndex = it.getInt(ARG_INITIAL_CHANNEL_INDEX, 0)
            initialSourceIndex = it.getInt(ARG_INITIAL_SOURCE_INDEX, 0)
            volumeBoostDb = it.getInt(ARG_VOLUME_BOOST_DB, 0)
            defaultScreenPosition = it.getInt(ARG_DEFAULT_SCREEN_POSITION, 1)
            restoreActiveIndex = it.getInt(ARG_RESTORE_ACTIVE_INDEX, -1)
            restoreFocusedIndex = it.getInt(ARG_RESTORE_FOCUSED_INDEX, -1)
            showChannelName = it.getBoolean(ARG_SHOW_CHANNEL_NAME, false)
            @Suppress("UNCHECKED_CAST")
            restoreScreenStates = it.getSerializable(ARG_RESTORE_SCREEN_STATES) as? ArrayList<ArrayList<String>>
        }

        Log.d(TAG, "Loaded ${channelUrls.size} channels, initial=$initialChannelIndex, sourceIndex=$initialSourceIndex, volumeBoost=$volumeBoostDb, defaultScreen=$defaultScreenPosition, restoreActive=$restoreActiveIndex, showChannelName=$showChannelName")

        initViews(view)

        for (i in 0..3) {
            initializePlayer(i)
        }

        view.isFocusableInTouchMode = true
        view.requestFocus()
        view.setOnKeyListener { _, keyCode, event ->
            when (event.action) {
                KeyEvent.ACTION_DOWN -> handleKeyDown(keyCode, event)
                KeyEvent.ACTION_UP -> handleKeyUp(keyCode, event)
                else -> false
            }
        }

        if (restoreActiveIndex >= 0 && restoreScreenStates != null) {
            Log.d(TAG, "Restoring multi-screen state")
            for (i in 0..3) {
                val stateData = restoreScreenStates?.getOrNull(i)
                if (stateData != null && stateData.size >= 3) {
                    val channelIndex = stateData[0].toIntOrNull() ?: -1
                    val sourceIndex = if (stateData.size >= 4) stateData[3].toIntOrNull() ?: 0 else 0
                    if (channelIndex >= 0 && channelIndex < channelUrls.size) {
                        Log.d(TAG, "Restoring screen $i: channelIndex=$channelIndex, sourceIndex=$sourceIndex")
                        playChannelOnScreen(i, channelIndex, sourceIndex)
                    }
                }
            }
            activeScreenIndex = restoreActiveIndex.coerceIn(0, 3)
            focusedScreenIndex = restoreFocusedIndex.coerceIn(0, 3)
            if (initialChannelIndex >= 0 && initialChannelIndex < channelUrls.size) {
                playChannelOnScreen(activeScreenIndex, initialChannelIndex, initialSourceIndex)
            }
            for (i in 0..3) {
                players[i]?.volume = if (i == activeScreenIndex) getEffectiveVolume() else 0f
            }
        } else {
            if (initialChannelIndex >= 0 && initialChannelIndex < channelUrls.size) {
                val screenIndex = (defaultScreenPosition - 1).coerceIn(0, 3)
                activeScreenIndex = screenIndex
                focusedScreenIndex = screenIndex
                playChannelOnScreen(screenIndex, initialChannelIndex, initialSourceIndex)
                players[screenIndex]?.volume = getEffectiveVolume()
            }
        }

        updateAllScreenOverlays()
        showControls()
    }

    private fun initViews(view: View) {
        topBar = view.findViewById(R.id.top_bar)
        bottomBar = view.findViewById(R.id.bottom_bar)

        channelSelectorPanel = view.findViewById(R.id.channel_selector_panel)
        categoryList = view.findViewById(R.id.selector_category_list)
        channelGrid = view.findViewById(R.id.selector_channel_grid)
        selectorScreenTitle = view.findViewById(R.id.selector_screen_title)
        selectorCategoryTitle = view.findViewById(R.id.selector_category_title)
        selectorChannelCount = view.findViewById(R.id.selector_channel_count)

        buildCategoryData()

        categoryList.layoutManager = LinearLayoutManager(requireContext())
        categoryList.adapter = CategoryAdapter()

        channelGrid.layoutManager = GridLayoutManager(requireContext(), 5)
        channelGrid.adapter = ChannelAdapter()

        val containerIds = arrayOf(R.id.screen_container_0, R.id.screen_container_1, R.id.screen_container_2, R.id.screen_container_3)
        val playerViewIds = arrayOf(R.id.player_view_0, R.id.player_view_1, R.id.player_view_2, R.id.player_view_3)
        val overlayIds = arrayOf(R.id.overlay_0, R.id.overlay_1, R.id.overlay_2, R.id.overlay_3)

        for (i in 0..3) {
            screenContainers[i] = view.findViewById(containerIds[i])
            playerViews[i] = view.findViewById(playerViewIds[i])
            overlays[i] = view.findViewById(overlayIds[i])

            overlays[i]?.findViewById<TextView>(R.id.screen_number)?.text = getString(R.string.screen_number, i + 1)
            overlays[i]?.findViewById<TextView>(R.id.badge_number)?.text = "${i + 1}"

            playerViews[i]?.useController = false
        }
    }

    private fun initializePlayer(index: Int) {
        Log.d(TAG, "Initializing player $index")

        val renderersFactory = DefaultRenderersFactory(requireContext())
            .setExtensionRendererMode(DefaultRenderersFactory.EXTENSION_RENDERER_MODE_PREFER)

        val loadControl = DefaultLoadControl.Builder()
            .setBufferDurationsMs(15000, 30000, 500, 1500)
            .build()

        val dataSourceFactory = DefaultHttpDataSource.Factory()
            .setConnectTimeoutMs(8000)
            .setReadTimeoutMs(15000)
            .setAllowCrossProtocolRedirects(true)
            .setUserAgent("Wget/1.21.3")
        
        val mediaSourceFactory = DefaultMediaSourceFactory(requireContext())
            .setDataSourceFactory(dataSourceFactory)

        players[index] = ExoPlayer.Builder(requireContext(), renderersFactory)
            .setLoadControl(loadControl)
            .setMediaSourceFactory(mediaSourceFactory)
            .build().also { player ->
                playerViews[index]?.player = player
                player.playWhenReady = true
                player.repeatMode = Player.REPEAT_MODE_OFF
                player.volume = if (index == activeScreenIndex) getEffectiveVolume() else 0f

                player.addListener(object : Player.Listener {
                    override fun onPlaybackStateChanged(playbackState: Int) {
                        when (playbackState) {
                            Player.STATE_BUFFERING -> {
                                NativeLogger.d(TAG, "Screen $index player state: BUFFERING")
                                screenStates[index].isLoading = true
                                screenStates[index].hasError = false
                                updateScreenOverlay(index)
                            }
                            Player.STATE_READY -> {
                                NativeLogger.i(TAG, "Screen $index player state: READY")
                                screenStates[index].isLoading = false
                                screenStates[index].hasError = false
                                updateScreenOverlay(index)
                            }
                            Player.STATE_ENDED -> {
                                NativeLogger.d(TAG, "Screen $index player state: ENDED")
                                screenStates[index].isLoading = false
                                updateScreenOverlay(index)
                            }
                            Player.STATE_IDLE -> {
                                NativeLogger.d(TAG, "Screen $index player state: IDLE")
                                screenStates[index].isLoading = false
                                updateScreenOverlay(index)
                            }
                        }
                    }

                    override fun onVideoSizeChanged(videoSize: VideoSize) {
                        screenStates[index].videoWidth = videoSize.width
                        screenStates[index].videoHeight = videoSize.height
                        NativeLogger.d(TAG, "Screen $index video size: ${videoSize.width}x${videoSize.height}")
                        updateScreenOverlay(index)
                    }

                    override fun onPlayerError(error: PlaybackException) {
                        NativeLogger.e(TAG, "Screen $index player error: ${error.message}, error code: ${error.errorCode}", error)
                        error.cause?.let { cause ->
                                NativeLogger.e(TAG, "Screen $index error cause: ${cause.message}", cause)
                        }
                        screenStates[index].isLoading = false
                        
                        val state = screenStates[index]
                        val sources = if (state.channelIndex >= 0 && state.channelIndex < channelSources.size) {
                            channelSources[state.channelIndex]
                        } else {
                            arrayListOf()
                        }
                        
                        if (state.retryCount < MAX_RETRIES) {
                            NativeLogger.w(TAG, "Screen $index retrying playback (attempt ${state.retryCount + 1}/$MAX_RETRIES)")
                            state.retryCount++
                            state.isLoading = true
                            updateScreenOverlay(index)
                            
                            handler.postDelayed({
                                playUrlOnScreen(index, state.channelUrl)
                            }, RETRY_DELAY)
                        } else if (state.currentSourceIndex + 1 < sources.size) {
                            NativeLogger.w(TAG, "Screen $index retry limit reached, checking next source")
                            state.isLoading = true
                            updateScreenOverlay(index)
                            
                            Thread {
                                val originalName = state.channelName
                                var foundIndex = -1
                                for (i in (state.currentSourceIndex + 1) until sources.size) {
                                    activity?.runOnUiThread {
                                        state.channelName = getString(
                                            R.string.channel_with_source_checking,
                                            originalName,
                                            i + 1,
                                            sources.size
                                        )
                                        updateScreenOverlay(index)
                                        Log.d(TAG, "Checking source ${i + 1}/${sources.size} for screen $index")
                                    }
                                    
                                    if (testSource(sources[i])) {
                                        NativeLogger.i(TAG, "Screen $index found available source ${i + 1}/${sources.size}")
                                        foundIndex = i
                                        break
                                    } else {
                                        NativeLogger.d(TAG, "Screen $index source ${i + 1}/${sources.size} unavailable")
                                    }
                                }
                                
                                activity?.runOnUiThread {
                                    state.channelName = originalName
                                    
                                    if (foundIndex >= 0) {
                                        NativeLogger.i(TAG, "Screen $index switching to source ${foundIndex + 1}/${sources.size}")
                                        state.currentSourceIndex = foundIndex
                                        state.retryCount = 0
                                        val nextUrl = sources[foundIndex]
                                        state.channelUrl = nextUrl
                                        state.isLoading = true
                                        updateScreenOverlay(index)
                                        
                                        playUrlOnScreen(index, nextUrl)
                                    } else {
                                        NativeLogger.e(TAG, "Screen $index all sources unavailable")
                                        state.hasError = true
                                        state.isLoading = false
                                        updateScreenOverlay(index)
                                    }
                                }
                            }.start()
                        } else {
                            NativeLogger.e(TAG, "Screen $index all retries failed, no more sources")
                            state.hasError = true
                            updateScreenOverlay(index)
                        }
                    }
                })
            }
    }
    
    private fun getEffectiveVolume(): Float {
        if (volumeBoostDb == 0) {
            return baseVolume
        }
        val boostFactor = 10.0.pow(volumeBoostDb / 20.0)
        return (baseVolume * boostFactor).coerceIn(0.0, 2.0).toFloat()
    }

    private fun playChannelOnScreen(screenIndex: Int, channelIndex: Int, sourceIndex: Int = 0) {
        if (screenIndex < 0 || screenIndex > 3) return
        if (channelIndex < 0 || channelIndex >= channelUrls.size) return

        (activity as? MainActivity)?.addWatchHistory(channelIndex)

        val sources = if (channelIndex < channelSources.size) channelSources[channelIndex] else arrayListOf()
        
        val name = channelNames.getOrElse(channelIndex) { "Channel ${channelIndex + 1}" }
        
        if (sources.size > 1 && sourceIndex == 0) {
            Log.d(TAG, "Multi-source channel '$name' on screen $screenIndex, starting auto-detection")
            
            screenStates[screenIndex].apply {
                this.channelIndex = channelIndex
                this.channelName = name
                this.channelUrl = ""
                this.isLoading = true
                this.hasError = false
                this.videoWidth = 0
                this.videoHeight = 0
                this.retryCount = 0
                this.currentSourceIndex = 0
            }
            updateScreenOverlay(screenIndex)
            
            Thread {
                var foundIndex = -1
                for (i in sources.indices) {
                    activity?.runOnUiThread {
                        screenStates[screenIndex].channelName = getString(
                            R.string.channel_with_source_checking,
                            name,
                            i + 1,
                            sources.size
                        )
                        updateScreenOverlay(screenIndex)
                    }
                    
                    if (testSource(sources[i])) {
                        Log.d(TAG, "Screen $screenIndex: Source ${i + 1} available")
                        foundIndex = i
                        break
                    }
                }
                
                if (foundIndex == -1) foundIndex = 0
                
                val finalIndex = foundIndex
                val finalUrl = sources[finalIndex]
                
                activity?.runOnUiThread {
                    screenStates[screenIndex].channelName = name
                    
                    screenStates[screenIndex].apply {
                        this.channelUrl = finalUrl
                        this.currentSourceIndex = finalIndex
                    }
                    updateScreenOverlay(screenIndex)
                    
                    playUrlOnScreen(screenIndex, finalUrl)
                }
            }.start()
        } else {
            val validSourceIndex = if (sources.isNotEmpty()) sourceIndex.coerceIn(0, sources.size - 1) else 0
            val url = if (sources.isNotEmpty()) {
                sources[validSourceIndex]
            } else {
                channelUrls[channelIndex]
            }

            Log.d(TAG, "Playing channel '$name' on screen $screenIndex, source ${validSourceIndex + 1}/${sources.size.coerceAtLeast(1)}")

            screenStates[screenIndex].apply {
                this.channelIndex = channelIndex
                this.channelName = name
                this.channelUrl = url
                this.isLoading = true
                this.hasError = false
                this.videoWidth = 0
                this.videoHeight = 0
                this.retryCount = 0
                this.currentSourceIndex = validSourceIndex
            }

            updateScreenOverlay(screenIndex)

            playUrlOnScreen(screenIndex, url)
        }
    }

    private fun resolveRealPlayUrl(url: String): String {
        return RedirectResolver.resolveRealPlayUrl(url, useCache = true)
    }

    private fun playUrlOnScreen(screenIndex: Int, url: String) {
        Thread {
            NativeLogger.d(TAG, "Screen $screenIndex >>> starting 302 redirect resolution")
            val startTime = System.currentTimeMillis()
            val redirectStartTime = System.currentTimeMillis()

            val realUrl = resolveRealPlayUrl(url)

            val redirectTime = System.currentTimeMillis() - redirectStartTime
            NativeLogger.d(TAG, "Screen $screenIndex >>> 302 redirect resolved in ${redirectTime}ms")

            activity?.runOnUiThread {
                NativeLogger.d(TAG, "Screen $screenIndex >>> using playback URL: $realUrl")
                NativeLogger.d(TAG, "Screen $screenIndex >>> initializing player")
                val playStartTime = System.currentTimeMillis()

                players[screenIndex]?.let { player ->
                    player.setMediaItem(MediaItem.fromUri(realUrl))
                    player.prepare()
                }

                val playTime = System.currentTimeMillis() - playStartTime
                val totalTime = System.currentTimeMillis() - startTime
                NativeLogger.d(TAG, "Screen $screenIndex >>> player initialized in ${playTime}ms")
                NativeLogger.i(TAG, "Screen $screenIndex >>> total startup time: ${totalTime}ms")
            }
        }.start()
    }

    private fun testSource(url: String): Boolean {
        return try {
            val realUrl = RedirectResolver.resolveRealPlayUrl(url, useCache = true)
            val isAvailable = realUrl.isNotEmpty()
            Log.d(TAG, "testSource: $url -> ${if (isAvailable) "available (real URL cached)" else "unavailable"}")
            isAvailable
        } catch (e: Exception) {
            Log.d(TAG, "testSource: $url -> error: ${e.message}")
            false
        }
    }

    private fun clearScreen(screenIndex: Int) {
        if (screenIndex < 0 || screenIndex > 3) return

        Log.d(TAG, "Clearing screen $screenIndex")

        players[screenIndex]?.stop()
        players[screenIndex]?.clearMediaItems()

        screenStates[screenIndex].apply {
            channelIndex = -1
            channelName = ""
            channelUrl = ""
            isLoading = false
            hasError = false
            videoWidth = 0
            videoHeight = 0
        }

        updateScreenOverlay(screenIndex)
    }

    private fun setActiveScreen(index: Int) {
        if (index < 0 || index > 3) return
        if (screenStates[index].channelIndex < 0) return
        if (index == activeScreenIndex) return

        Log.d(TAG, "Setting active screen to $index")

        players[activeScreenIndex]?.volume = 0f

        activeScreenIndex = index

        players[activeScreenIndex]?.volume = getEffectiveVolume()

        updateAllScreenOverlays()
        
        Toast.makeText(requireContext(), getString(R.string.screen_activated, index + 1), Toast.LENGTH_SHORT).show()
    }

    private fun updateAllScreenOverlays() {
        for (i in 0..3) {
            updateScreenOverlay(i)
        }
    }

    private fun updateScreenOverlay(index: Int) {
        val overlay = overlays[index] ?: return
        val state = screenStates[index]
        val isFocused = index == focusedScreenIndex
        val isActive = index == activeScreenIndex && state.channelIndex >= 0

        Log.d(TAG, "updateScreenOverlay: index=$index, showChannelName=$showChannelName, channelIndex=${state.channelIndex}, isLoading=${state.isLoading}, hasError=${state.hasError}")

        activity?.runOnUiThread {
            val focusBorder = overlay.findViewById<View>(R.id.focus_border)
            focusBorder?.visibility = if (isFocused) View.VISIBLE else View.GONE

            val activeBorder = overlay.findViewById<View>(R.id.active_border)
            activeBorder?.visibility = View.GONE

            val badge = overlay.findViewById<View>(R.id.screen_badge)
            badge?.visibility = View.GONE

            val loadingIndicator = overlay.findViewById<ProgressBar>(R.id.loading_indicator)
            val emptyPlaceholder = overlay.findViewById<View>(R.id.empty_placeholder)
            val errorContainer = overlay.findViewById<View>(R.id.error_container)
            val bottomInfo = overlay.findViewById<View>(R.id.bottom_info)
            val channelNameText = overlay.findViewById<TextView>(R.id.channel_name)
            val infoContainer = overlay.findViewById<View>(R.id.info_container)
            val resolutionText = overlay.findViewById<TextView>(R.id.resolution_text)
            val audioIcon = overlay.findViewById<ImageView>(R.id.audio_icon)
            val emptyHint = overlay.findViewById<TextView>(R.id.empty_hint)
            val emptyIcon = overlay.findViewById<ImageView>(R.id.empty_icon)

            when {
                state.channelIndex < 0 -> {
                    emptyPlaceholder?.visibility = View.VISIBLE
                    loadingIndicator?.visibility = View.GONE
                    errorContainer?.visibility = View.GONE
                    bottomInfo?.visibility = View.GONE
                    infoContainer?.visibility = View.GONE
                    emptyHint?.text = if (isFocused) getString(R.string.press_ok_to_add_channel) else ""
                    emptyIcon?.setColorFilter(if (isFocused) 0xFF00BCD4.toInt() else 0xFF666666.toInt())
                }
                state.hasError -> {
                    emptyPlaceholder?.visibility = View.GONE
                    loadingIndicator?.visibility = View.GONE
                    errorContainer?.visibility = View.VISIBLE
                    bottomInfo?.visibility = if (showChannelName) View.VISIBLE else View.GONE
                    channelNameText?.text = state.channelName
                    infoContainer?.visibility = View.GONE
                }
                state.isLoading -> {
                    emptyPlaceholder?.visibility = View.GONE
                    loadingIndicator?.visibility = View.VISIBLE
                    errorContainer?.visibility = View.GONE
                    bottomInfo?.visibility = if (showChannelName) View.VISIBLE else View.GONE
                    channelNameText?.text = state.channelName
                    infoContainer?.visibility = View.GONE
                }
                else -> {
                    emptyPlaceholder?.visibility = View.GONE
                    loadingIndicator?.visibility = View.GONE
                    errorContainer?.visibility = View.GONE
                    bottomInfo?.visibility = if (showChannelName) View.VISIBLE else View.GONE
                    channelNameText?.text = state.channelName

                    if (state.videoWidth > 0 && state.videoHeight > 0) {
                        infoContainer?.visibility = View.VISIBLE
                        resolutionText?.text = "${state.videoWidth}x${state.videoHeight}"
                        audioIcon?.visibility = if (isActive) View.VISIBLE else View.GONE
                    } else {
                        if (isActive) {
                            infoContainer?.visibility = View.VISIBLE
                            resolutionText?.text = ""
                            audioIcon?.visibility = View.VISIBLE
                        } else {
                            infoContainer?.visibility = View.GONE
                        }
                    }
                }
            }
        }
    }

    
    private fun handleKeyDown(keyCode: Int, event: KeyEvent): Boolean {
        Log.d(TAG, "handleKeyDown: keyCode=$keyCode, channelSelectorVisible=$channelSelectorVisible, ignoreInitial=$ignoreInitialKeyEvents")
        
        if (ignoreInitialKeyEvents) {
            if (System.currentTimeMillis() - initTime < 500) {
                Log.d(TAG, "Ignoring initial key event")
                return true
            }
            ignoreInitialKeyEvents = false
        }
        
        if (channelSelectorVisible) {
            return handleSelectorKeyDown(keyCode, event)
        }
        
        when (keyCode) {
            KeyEvent.KEYCODE_DPAD_CENTER, KeyEvent.KEYCODE_ENTER -> {
                if (okKeyDownTime == 0L) {
                    okKeyDownTime = System.currentTimeMillis()
                    longPressHandled = false
                }
                
                handler.postDelayed({
                    if (okKeyDownTime > 0 && !longPressHandled) {
                        val pressDuration = System.currentTimeMillis() - okKeyDownTime
                        if (pressDuration >= LONG_PRESS_THRESHOLD) {
                            longPressHandled = true
                            handleLongPressOk()
                        }
                    }
                }, LONG_PRESS_THRESHOLD)
                
                return true
            }
            
            KeyEvent.KEYCODE_DPAD_UP -> {
                moveFocus(0, -1)
                return true
            }
            
            KeyEvent.KEYCODE_DPAD_DOWN -> {
                moveFocus(0, 1)
                return true
            }
            
            KeyEvent.KEYCODE_DPAD_LEFT -> {
                if (leftKeyDownTime == 0L) {
                    leftKeyDownTime = System.currentTimeMillis()
                    navLongPressHandled = false
                    
                    handler.postDelayed({
                        if (leftKeyDownTime > 0 && !navLongPressHandled) {
                            navLongPressHandled = true
                            switchSourceOnFocusedScreen(-1)
                        }
                    }, LONG_PRESS_THRESHOLD)
                }
                return true
            }
            
            KeyEvent.KEYCODE_DPAD_RIGHT -> {
                if (rightKeyDownTime == 0L) {
                    rightKeyDownTime = System.currentTimeMillis()
                    navLongPressHandled = false
                    
                    handler.postDelayed({
                        if (rightKeyDownTime > 0 && !navLongPressHandled) {
                            navLongPressHandled = true
                            switchSourceOnFocusedScreen(1)
                        }
                    }, LONG_PRESS_THRESHOLD)
                }
                return true
            }
            
            KeyEvent.KEYCODE_BACK, KeyEvent.KEYCODE_ESCAPE -> {
                return handleBackKey()
            }
            
            KeyEvent.KEYCODE_CHANNEL_UP, KeyEvent.KEYCODE_PAGE_UP -> {
                switchChannelOnFocusedScreen(-1)
                return true
            }
            
            KeyEvent.KEYCODE_CHANNEL_DOWN, KeyEvent.KEYCODE_PAGE_DOWN -> {
                switchChannelOnFocusedScreen(1)
                return true
            }
            
            KeyEvent.KEYCODE_VOLUME_UP -> {
                return false
            }
            
            KeyEvent.KEYCODE_VOLUME_DOWN -> {
                return false
            }
            
            KeyEvent.KEYCODE_MENU, KeyEvent.KEYCODE_INFO -> {
                toggleControls()
                return true
            }
        }
        
        showControls()
        return false
    }
    
    private fun handleKeyUp(keyCode: Int, event: KeyEvent): Boolean {
        when (keyCode) {
            KeyEvent.KEYCODE_DPAD_CENTER, KeyEvent.KEYCODE_ENTER -> {
                val pressDuration = System.currentTimeMillis() - okKeyDownTime
                okKeyDownTime = 0L
                
                if (longPressHandled) {
                    longPressHandled = false
                    return true
                }
                
                if (pressDuration < LONG_PRESS_THRESHOLD) {
                    handleShortPressOk()
                }
                
                return true
            }
            
            KeyEvent.KEYCODE_DPAD_LEFT -> {
                if (leftKeyDownTime > 0) {
                    leftKeyDownTime = 0L
                    if (!navLongPressHandled) {
                        moveFocus(-1, 0)
                    }
                    navLongPressHandled = false
                }
                return true
            }
            
            KeyEvent.KEYCODE_DPAD_RIGHT -> {
                if (rightKeyDownTime > 0) {
                    rightKeyDownTime = 0L
                    if (!navLongPressHandled) {
                        moveFocus(1, 0)
                    }
                    navLongPressHandled = false
                }
                return true
            }
        }
        return false
    }


    private var leftKeyDownTime = 0L
    private var rightKeyDownTime = 0L
    private var navLongPressHandled = false
    
    private fun switchSourceOnFocusedScreen(direction: Int) {
        val index = focusedScreenIndex
        val state = screenStates[index]
        
        if (state.channelIndex < 0) return
        
        val sources = if (state.channelIndex < channelSources.size) {
            channelSources[state.channelIndex]
        } else {
            arrayListOf()
        }
        
        if (sources.size <= 1) {
            Toast.makeText(requireContext(), getString(R.string.current_channel_single_source), Toast.LENGTH_SHORT).show()
            return 
        }
        
        var newSourceIndex = state.currentSourceIndex + direction
        if (newSourceIndex < 0) newSourceIndex = sources.size - 1
        if (newSourceIndex >= sources.size) newSourceIndex = 0
        
        Log.d(TAG, "Manually switching source on screen $index to $newSourceIndex")
        
        
        playChannelOnScreen(index, state.channelIndex, newSourceIndex)
        
        val directionLabel = if (direction > 0) {
            getString(R.string.next_source_label)
        } else {
            getString(R.string.previous_source_label)
        }
        Toast.makeText(
            requireContext(),
            getString(
                R.string.switched_to_source,
                directionLabel,
                newSourceIndex + 1,
                sources.size
            ),
            Toast.LENGTH_SHORT
        ).show()
    }

    private fun moveFocus(dx: Int, dy: Int) {
        //          2 3
        val col = focusedScreenIndex % 2
        val row = focusedScreenIndex / 2
        
        var newCol = col + dx
        var newRow = row + dy
        
        newCol = newCol.coerceIn(0, 1)
        newRow = newRow.coerceIn(0, 1)
        
        val newIndex = newRow * 2 + newCol
        
        if (newIndex != focusedScreenIndex) {
            focusedScreenIndex = newIndex
            
            if (screenStates[newIndex].channelIndex >= 0) {
                setActiveScreen(newIndex)
            }
            
            updateAllScreenOverlays()
            showControls()
        }
    }
    
    private fun handleShortPressOk() {
        val currentState = screenStates[focusedScreenIndex]
        
        if (currentState.channelIndex < 0) {
            showChannelSelector(focusedScreenIndex)
        } else {
            setActiveScreen(focusedScreenIndex)
        }
        showControls()
    }
    
    private fun handleLongPressOk() {
        Log.d(TAG, "Long press OK - clearing screen $focusedScreenIndex")
        
        if (focusedScreenIndex == activeScreenIndex) {
            for (i in 0..3) {
                if (i != focusedScreenIndex && screenStates[i].channelIndex >= 0) {
                    setActiveScreen(i)
                    break
                }
            }
        }
        
        clearScreen(focusedScreenIndex)
        Toast.makeText(requireContext(), getString(R.string.screen_cleared, focusedScreenIndex + 1), Toast.LENGTH_SHORT).show()
    }
    
    private fun switchChannelOnFocusedScreen(direction: Int) {
        val currentState = screenStates[focusedScreenIndex]
        val currentIndex = if (currentState.channelIndex >= 0) {
            currentState.channelIndex
        } else {
            screenStates[activeScreenIndex].channelIndex.coerceAtLeast(0)
        }
        
        val newIndex = (currentIndex + direction + channelUrls.size) % channelUrls.size
        playChannelOnScreen(focusedScreenIndex, newIndex)
        showControls()
    }
    
    fun handleBackKey(): Boolean {
        Log.d(TAG, "handleBackKey called, channelSelectorVisible=$channelSelectorVisible")
        
        if (channelSelectorVisible) {
            Log.d(TAG, "Closing channel selector")
            hideChannelSelector()
            return true
        }
        
        val activeState = screenStates[activeScreenIndex]
        Log.d(TAG, "Active screen channel index: ${activeState.channelIndex}, source index: ${activeState.currentSourceIndex}")
        
        if (activeState.channelIndex >= 0) {
            Log.d(TAG, "Exiting to normal player with channel: ${activeState.channelIndex}, source: ${activeState.currentSourceIndex}")
            onExitToNormalPlayer?.invoke(activeState.channelIndex, activeState.currentSourceIndex)
        } else {
            Log.d(TAG, "No active channel, closing multi-screen")
            onCloseListener?.invoke()
        }
        return true
    }
    
    private fun showExitDialog() {
        val activeState = screenStates[activeScreenIndex]
        val channelName = activeState.channelName
        
        android.app.AlertDialog.Builder(requireContext())
            .setTitle(getString(R.string.exit_multi_screen))
            .setMessage(getString(R.string.currently_playing, channelName))
            .setPositiveButton(getString(R.string.continue_playing)) { _, _ ->
                onExitToNormalPlayer?.invoke(activeState.channelIndex, activeState.currentSourceIndex)
                onCloseListener?.invoke()
            }
            .setNegativeButton(getString(R.string.close)) { _, _ ->
                onCloseListener?.invoke()
            }
            .setNeutralButton(getString(R.string.cancel), null)
            .show()
    }
    
    
    private fun showControls() {
        if (!controlsVisible) {
            controlsVisible = true
            topBar.visibility = View.VISIBLE
            bottomBar.visibility = View.VISIBLE
        }
        
        hideControlsRunnable?.let { handler.removeCallbacks(it) }
        hideControlsRunnable = Runnable {
            hideControls()
        }
        handler.postDelayed(hideControlsRunnable!!, CONTROLS_HIDE_DELAY)
    }
    
    private fun hideControls() {
        controlsVisible = false
        topBar.visibility = View.GONE
        bottomBar.visibility = View.GONE
    }
    
    private fun toggleControls() {
        if (controlsVisible) {
            hideControls()
        } else {
            showControls()
        }
    }
    
    
    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume")
        
        activity?.window?.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
        
        for (i in 0..3) {
            if (screenStates[i].channelIndex >= 0) {
                players[i]?.let { p ->
                    if (p.playbackState == Player.STATE_IDLE || p.playbackState == Player.STATE_ENDED) {
                        Log.d(TAG, "Screen $i player in IDLE/ENDED state, reloading...")
                        val channelIndex = screenStates[i].channelIndex
                        val sourceIndex = screenStates[i].currentSourceIndex
                        if (channelIndex >= 0 && channelIndex < channelUrls.size) {
                            val sources = channelSources.getOrNull(channelIndex) ?: arrayListOf()
                            if (sourceIndex >= 0 && sourceIndex < sources.size) {
                                playChannelOnScreen(i, channelIndex, sourceIndex)
                            }
                        }
                    } else {
                        p.play()
                    }
                } ?: run {
                    Log.d(TAG, "Screen $i player is null, reinitializing...")
                    val channelIndex = screenStates[i].channelIndex
                    val sourceIndex = screenStates[i].currentSourceIndex
                    if (channelIndex >= 0 && channelIndex < channelUrls.size) {
                        val sources = channelSources.getOrNull(channelIndex) ?: arrayListOf()
                        if (sourceIndex >= 0 && sourceIndex < sources.size) {
                            playChannelOnScreen(i, channelIndex, sourceIndex)
                        }
                    }
                }
            }
        }
    }
    
    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause")
        
        for (i in 0..3) {
            players[i]?.pause()
        }
    }
    
    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(TAG, "onDestroyView")
        
        hideControlsRunnable?.let { handler.removeCallbacks(it) }
        
        for (i in 0..3) {
            players[i]?.release()
            players[i] = null
        }
        
        activity?.window?.clearFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
    }
    
    
    fun setVolumeBoost(db: Int) {
        volumeBoostDb = db
        players[activeScreenIndex]?.volume = getEffectiveVolume()
    }
    
    
    private val imageExecutor = Executors.newFixedThreadPool(8)
    
    private fun loadImageAsync(url: String, imageView: ImageView, defaultView: ImageView) {
        if (url.isEmpty()) {
            imageView.visibility = View.GONE
            defaultView.visibility = View.VISIBLE
            return
        }
        
        if (imageCache.containsKey(url)) {
            val bitmap = imageCache[url]
            if (bitmap != null) {
                imageView.setImageBitmap(bitmap)
                imageView.visibility = View.VISIBLE
                defaultView.visibility = View.GONE
            } else {
                imageView.visibility = View.GONE
                defaultView.visibility = View.VISIBLE
            }
            return
        }
        
        imageView.visibility = View.GONE
        defaultView.visibility = View.VISIBLE
        
        synchronized(loadingUrls) {
            if (loadingUrls.contains(url)) return
            loadingUrls.add(url)
        }
        
        imageExecutor.execute {
            try {
                val connection = URL(url).openConnection()
                connection.connectTimeout = 3000
                connection.readTimeout = 3000
                val inputStream = connection.getInputStream()
                val bitmap = BitmapFactory.decodeStream(inputStream)
                inputStream.close()
                
                imageCache[url] = bitmap
                
                handler.post {
                    if (bitmap != null) {
                        imageView.setImageBitmap(bitmap)
                        imageView.visibility = View.VISIBLE
                        defaultView.visibility = View.GONE
                    }
                }
            } catch (e: Exception) {
                imageCache[url] = null
            } finally {
                synchronized(loadingUrls) {
                    loadingUrls.remove(url)
                }
            }
        }
    }
    
    private fun preloadLogos(startIndex: Int, count: Int) {
        val filteredChannels = getFilteredChannels()
        val endIndex = minOf(startIndex + count, filteredChannels.size)
        
        for (i in startIndex until endIndex) {
            val channelIndex = filteredChannels[i]
            val logoUrl = channelLogos.getOrElse(channelIndex) { "" }
            if (logoUrl.isNotEmpty() && !imageCache.containsKey(logoUrl)) {
                val shouldLoad = synchronized(loadingUrls) {
                    if (loadingUrls.contains(logoUrl)) {
                        false
                    } else {
                        loadingUrls.add(logoUrl)
                        true
                    }
                }
                
                if (shouldLoad) {
                    imageExecutor.execute {
                        try {
                            val connection = URL(logoUrl).openConnection()
                            connection.connectTimeout = 3000
                            connection.readTimeout = 3000
                            val inputStream = connection.getInputStream()
                            val bitmap = BitmapFactory.decodeStream(inputStream)
                            inputStream.close()
                            imageCache[logoUrl] = bitmap
                        } catch (e: Exception) {
                            imageCache[logoUrl] = null
                        } finally {
                            synchronized(loadingUrls) {
                                loadingUrls.remove(logoUrl)
                            }
                        }
                    }
                }
            }
        }
    }
    
    
    private fun buildCategoryData() {
        categories.clear()
        categoryChannelCounts.clear()
        
        for (group in channelGroups) {
            val count = categoryChannelCounts[group] ?: 0
            categoryChannelCounts[group] = count + 1
        }
        
        val uniqueGroups = channelGroups.distinct()
        categories.addAll(uniqueGroups)
        
        Log.d(TAG, "Built category data: ${categories.size} categories")
    }
    
    private fun showChannelSelector(screenIndex: Int) {
        targetScreenForSelector = screenIndex
        channelSelectorVisible = true
        selectedCategoryIndex = 0
        categoryFocusIndex = 0
        channelFocusIndex = 0
        isCategoryFocused = true
        
        selectorScreenTitle.text = getString(R.string.screen_number, screenIndex + 1)
        
        categoryList.adapter?.notifyDataSetChanged()
        updateChannelGrid()
        
        preloadLogos(0, 20)
        
        channelSelectorPanel.visibility = View.VISIBLE
        
        hideControls()
    }
    
    private fun hideChannelSelector() {
        channelSelectorVisible = false
        channelSelectorPanel.visibility = View.GONE
        showControls()
    }
    
    private fun updateChannelGrid() {
        val categoryName = if (selectedCategoryIndex == 0) {
            selectorCategoryTitle.text = getString(R.string.all_channels)
            selectorChannelCount.text = getString(R.string.channel_count, channelUrls.size)
            null
        } else {
            val name = categories[selectedCategoryIndex - 1]
            selectorCategoryTitle.text = name
            val count = categoryChannelCounts[name] ?: 0
            selectorChannelCount.text = getString(R.string.channel_count, count)
            name
        }
        
        channelGrid.adapter?.notifyDataSetChanged()
        
        preloadLogos(0, 20)
    }
    
    private fun getFilteredChannels(): List<Int> {
        return if (selectedCategoryIndex == 0) {
            channelUrls.indices.toList()
        } else {
            val categoryName = categories[selectedCategoryIndex - 1]
            channelUrls.indices.filter { channelGroups.getOrNull(it) == categoryName }
        }
    }
    
    private fun handleSelectorKeyDown(keyCode: Int, event: KeyEvent): Boolean {
        Log.d(TAG, "handleSelectorKeyDown: keyCode=$keyCode")
        
        when (keyCode) {
            KeyEvent.KEYCODE_BACK, KeyEvent.KEYCODE_ESCAPE -> {
                Log.d(TAG, "Selector: Back key pressed, hiding selector")
                hideChannelSelector()
                return true
            }
            
            KeyEvent.KEYCODE_DPAD_LEFT -> {
                if (!isCategoryFocused) {
                    val columns = 5
                    if (channelFocusIndex % columns > 0) {
                        channelFocusIndex--
                        channelGrid.adapter?.notifyDataSetChanged()
                        channelGrid.scrollToPosition(channelFocusIndex)
                    } else {
                        isCategoryFocused = true
                        categoryList.adapter?.notifyDataSetChanged()
                        channelGrid.adapter?.notifyDataSetChanged()
                    }
                }
                return true
            }
            
            KeyEvent.KEYCODE_DPAD_RIGHT -> {
                if (isCategoryFocused) {
                    isCategoryFocused = false
                    channelFocusIndex = 0
                    categoryList.adapter?.notifyDataSetChanged()
                    channelGrid.adapter?.notifyDataSetChanged()
                    channelGrid.scrollToPosition(0)
                } else {
                    val columns = 5
                    val filteredChannels = getFilteredChannels()
                    if (channelFocusIndex % columns < columns - 1 && channelFocusIndex + 1 < filteredChannels.size) {
                        channelFocusIndex++
                        channelGrid.adapter?.notifyDataSetChanged()
                        channelGrid.scrollToPosition(channelFocusIndex)
                    }
                }
                return true
            }
            
            KeyEvent.KEYCODE_DPAD_UP -> {
                if (isCategoryFocused) {
                    if (categoryFocusIndex > 0) {
                        categoryFocusIndex--
                        categoryList.adapter?.notifyDataSetChanged()
                        categoryList.scrollToPosition(categoryFocusIndex)
                    }
                } else {
                    val columns = 5
                    if (channelFocusIndex >= columns) {
                        channelFocusIndex -= columns
                        channelGrid.adapter?.notifyDataSetChanged()
                        channelGrid.scrollToPosition(channelFocusIndex)
                    }
                }
                return true
            }
            
            KeyEvent.KEYCODE_DPAD_DOWN -> {
                if (isCategoryFocused) {
                    val maxIndex = categories.size
                    if (categoryFocusIndex < maxIndex) {
                        categoryFocusIndex++
                        categoryList.adapter?.notifyDataSetChanged()
                        categoryList.scrollToPosition(categoryFocusIndex)
                    }
                } else {
                    val columns = 5
                    val filteredChannels = getFilteredChannels()
                    if (channelFocusIndex + columns < filteredChannels.size) {
                        channelFocusIndex += columns
                        channelGrid.adapter?.notifyDataSetChanged()
                        channelGrid.scrollToPosition(channelFocusIndex)
                    }
                }
                return true
            }
            
            KeyEvent.KEYCODE_DPAD_CENTER, KeyEvent.KEYCODE_ENTER -> {
                if (isCategoryFocused) {
                    selectedCategoryIndex = categoryFocusIndex
                    channelFocusIndex = 0
                    updateChannelGrid()
                    categoryList.adapter?.notifyDataSetChanged()
                } else {
                    val filteredChannels = getFilteredChannels()
                    if (channelFocusIndex < filteredChannels.size) {
                        val channelIndex = filteredChannels[channelFocusIndex]
                        playChannelOnScreen(targetScreenForSelector, channelIndex)
                        hideChannelSelector()
                    }
                }
                return true
            }
        }
        return false
    }
    
    
    inner class CategoryAdapter : RecyclerView.Adapter<CategoryAdapter.ViewHolder>() {
        
        inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
            val indicator: View = view.findViewById(R.id.category_indicator)
            val name: TextView = view.findViewById(R.id.category_name)
            val count: TextView = view.findViewById(R.id.category_count)
        }
        
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_category, parent, false)
            return ViewHolder(view)
        }
        
        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val isSelected = position == selectedCategoryIndex
            val isFocused = isCategoryFocused && position == categoryFocusIndex
            
            if (position == 0) {
                holder.name.text = getString(R.string.all_channels)
                holder.count.text = channelUrls.size.toString()
            } else {
                val categoryName = categories[position - 1]
                holder.name.text = categoryName
                holder.count.text = (categoryChannelCounts[categoryName] ?: 0).toString()
            }
            
            holder.indicator.visibility = if (isSelected) View.VISIBLE else View.INVISIBLE
            holder.name.setTextColor(if (isSelected) 0xFFE91E63.toInt() else Color.WHITE)
            
            holder.itemView.setBackgroundColor(
                when {
                    isFocused -> 0x33E91E63.toInt()
                    isSelected -> 0x1AE91E63.toInt()
                    else -> Color.TRANSPARENT
                }
            )
        }
        
        override fun getItemCount(): Int = categories.size + 1
    }
    
    inner class ChannelAdapter : RecyclerView.Adapter<ChannelAdapter.ViewHolder>() {
        
        inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
            val logo: ImageView = view.findViewById(R.id.channel_logo)
            val defaultLogo: ImageView = view.findViewById(R.id.default_logo)
            val name: TextView = view.findViewById(R.id.channel_name)
            val container: View = view
        }
        
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_channel_grid, parent, false)
            return ViewHolder(view)
        }
        
        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val filteredChannels = getFilteredChannels()
            if (position >= filteredChannels.size) return
            
            val channelIndex = filteredChannels[position]
            val isFocused = !isCategoryFocused && position == channelFocusIndex
            
            holder.name.text = channelNames.getOrElse(channelIndex) { "Channel ${channelIndex + 1}" }
            
            val logoUrl = channelLogos.getOrElse(channelIndex) { "" }
            loadImageAsync(logoUrl, holder.logo, holder.defaultLogo)
            
            val bgView = holder.container.findViewById<View>(R.id.item_background)
            bgView?.setBackgroundResource(
                if (isFocused) R.drawable.channel_grid_item_focused else R.drawable.channel_grid_item_bg
            )
        }
        
        override fun getItemCount(): Int = getFilteredChannels().size
    }
}
