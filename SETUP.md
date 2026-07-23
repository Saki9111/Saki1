# Setup - Taxi City Zagreb Android

## Preduvjeti
- Android Studio Hedgehog+ (2023.1.1+)
- JDK 17+
- Android SDK 34+
- Kotlin 1.9+

## Instalacija

### 1. Kloniraj projekt
```bash
git clone https://github.com/Saki9111/Saki1.git
cd Saki1
```

### 2. Otvori u Android Studiou
```bash
open -a "Android Studio" .
```

### 3. Sinkronizacija Gradle datoteka
- Android Studio će automatski preuzeti dependencije
- Ako ne, idi na: `File → Sync Now`

### 4. Konfiguracija Firebase
1. Kreiraj projekt na [Firebase Console](https://console.firebase.google.com/)
2. Preuzmi `google-services.json`
3. Stavi datoteku u `app/` direktorij

### 5. Google Maps API
1. Kreiraj API key na [Google Cloud Console](https://console.cloud.google.com/)
2. Aktiviraj:
   - Maps SDK for Android
   - Directions API
   - Distance Matrix API
3. Dodaj key u `local.properties`:
   ```
   MAPS_API_KEY=your_api_key_here
   ```

### 6. Pokreni aplikaciju
```bash
./gradlew build
./gradlew run
```
Ili koristi Android Studio emulator/device.

## Struktura grana
- `main` - Production (stabilna verzija)
- `dev/android-setup` - Development
- `feature/*` - Nove značajke

## Problemi?
Vidi `docs/TROUBLESHOOTING.md`