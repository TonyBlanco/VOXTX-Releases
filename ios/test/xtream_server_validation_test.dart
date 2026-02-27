import 'package:flutter_test/flutter_test.dart';

// Import the class under test.  Because AddXtreamDialog is a widget we only
// call its *static* helper `validateServerInput` — no widget tree needed.
import 'package:VoxTv/features/playlist/widgets/add_xtream_dialog.dart';

void main() {
  group('AddXtreamDialog.validateServerInput', () {
    // ── Invalid inputs ─────────────────────────────────────────────────────

    test('rejects empty string', () {
      expect(
        () => AddXtreamDialog.validateServerInput(''),
        throwsA(isA<Exception>()),
      );
    });

    test('rejects whitespace-only string', () {
      expect(
        () => AddXtreamDialog.validateServerInput('   '),
        throwsA(isA<Exception>()),
      );
    });

    test('rejects bare "http"', () {
      expect(
        () => AddXtreamDialog.validateServerInput('http'),
        throwsA(isA<Exception>().having(
          (e) => e.toString(),
          'message',
          contains('inválido'),
        )),
      );
    });

    test('rejects bare "https"', () {
      expect(
        () => AddXtreamDialog.validateServerInput('https'),
        throwsA(isA<Exception>()),
      );
    });

    test('rejects bare "HTTP" (case-insensitive)', () {
      expect(
        () => AddXtreamDialog.validateServerInput('HTTP'),
        throwsA(isA<Exception>()),
      );
    });

    test('rejects "http://http"', () {
      expect(
        () => AddXtreamDialog.validateServerInput('http://http'),
        throwsA(isA<Exception>().having(
          (e) => e.toString(),
          'message',
          contains('no es un dominio'),
        )),
      );
    });

    test('rejects "https://http"', () {
      expect(
        () => AddXtreamDialog.validateServerInput('https://http'),
        throwsA(isA<Exception>()),
      );
    });

    test('rejects "http://https"', () {
      expect(
        () => AddXtreamDialog.validateServerInput('http://https'),
        throwsA(isA<Exception>()),
      );
    });

    test('rejects "https://https"', () {
      expect(
        () => AddXtreamDialog.validateServerInput('https://https'),
        throwsA(isA<Exception>()),
      );
    });

    test('rejects single-word host without dot (e.g. "myserver")', () {
      expect(
        () => AddXtreamDialog.validateServerInput('myserver'),
        throwsA(isA<Exception>()),
      );
    });

    // ── Valid inputs ────────────────────────────────────────────────────────

    test('accepts "panel.com:8080" → normalises to http://panel.com:8080', () {
      final result = AddXtreamDialog.validateServerInput('panel.com:8080');
      expect(result, 'http://panel.com:8080');
    });

    test('accepts "https://panel.com" → keeps https', () {
      final result = AddXtreamDialog.validateServerInput('https://panel.com');
      expect(result, 'https://panel.com');
    });

    test('accepts "http://192.168.1.1:25461"', () {
      final result =
          AddXtreamDialog.validateServerInput('http://192.168.1.1:25461');
      expect(result, 'http://192.168.1.1:25461');
    });

    test('accepts "192.168.1.1:25461" → adds http://', () {
      final result =
          AddXtreamDialog.validateServerInput('192.168.1.1:25461');
      expect(result, 'http://192.168.1.1:25461');
    });

    test('accepts "panel.example.com" → adds http://', () {
      final result =
          AddXtreamDialog.validateServerInput('panel.example.com');
      expect(result, 'http://panel.example.com');
    });

    test('strips trailing slashes', () {
      final result =
          AddXtreamDialog.validateServerInput('http://panel.com:8080///');
      expect(result, 'http://panel.com:8080');
    });

    test('trims whitespace', () {
      final result =
          AddXtreamDialog.validateServerInput('  panel.com:8080  ');
      expect(result, 'http://panel.com:8080');
    });

    test('accepts localhost for dev/testing', () {
      final result = AddXtreamDialog.validateServerInput('localhost');
      expect(result, 'http://localhost');
    });

    test('accepts "http://localhost:8080"', () {
      final result =
          AddXtreamDialog.validateServerInput('http://localhost:8080');
      expect(result, 'http://localhost:8080');
    });

    // ── iOS auto-capitalisation cases ──────────────────────────────────────

    test('handles iOS auto-capitalised "Http://panel.com:8080"', () {
      final result =
          AddXtreamDialog.validateServerInput('Http://panel.com:8080');
      expect(result, 'http://panel.com:8080');
    });

    test('handles iOS all-caps "HTTP://panel.com"', () {
      final result =
          AddXtreamDialog.validateServerInput('HTTP://panel.com');
      expect(result, 'http://panel.com');
    });

    test('handles "Https://secure.panel.com"', () {
      final result =
          AddXtreamDialog.validateServerInput('Https://secure.panel.com');
      expect(result, 'https://secure.panel.com');
    });

    test('handles "HTTPS://PANEL.COM:25461"', () {
      final result =
          AddXtreamDialog.validateServerInput('HTTPS://PANEL.COM:25461');
      // Scheme is lowercased; host case preserved (DNS is case-insensitive)
      expect(result, 'https://PANEL.COM:25461');
    });

    test('handles mixed case "hTtP://panel.com"', () {
      final result =
          AddXtreamDialog.validateServerInput('hTtP://panel.com');
      expect(result, 'http://panel.com');
    });
  });
}
