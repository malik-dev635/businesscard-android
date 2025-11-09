# Business Card App 📇

Une application Android moderne qui affiche une carte de visite élégante avec Jetpack Compose.

![Android](https://img.shields.io/badge/Android-3DDC84?style=for-the-badge&logo=android&logoColor=white)
![Kotlin](https://img.shields.io/badge/Kotlin-0095D5?style=for-the-badge&logo=kotlin&logoColor=white)
![Jetpack Compose](https://img.shields.io/badge/Jetpack%20Compose-4285F4?style=for-the-badge&logo=jetpack-compose&logoColor=white)

## 📱 Aperçu

Cette application affiche une carte de visite professionnelle avec :
- Un logo Android personnalisé
- Nom et titre professionnel
- Coordonnées (téléphone, email, réseaux sociaux)
- Design moderne avec Material Design 3
- Interface responsive et élégante

## 🎨 Fonctionnalités

- **Design moderne** : Interface utilisateur élégante avec fond dégradé bleu foncé
- **Icônes Material** : Utilisation des icônes Material Design pour les contacts
- **Jetpack Compose** : Interface construite entièrement avec Compose
- **Responsive** : S'adapte à différentes tailles d'écran
- **Accessible** : Support des descriptions de contenu pour l'accessibilité

## 🛠️ Technologies utilisées

- **Kotlin** - Langage de programmation moderne pour Android
- **Jetpack Compose** - Toolkit moderne pour créer des interfaces natives
- **Material Design 3** - Système de design moderne de Google
- **Android Studio** - IDE officiel pour le développement Android

## 📋 Prérequis

- Android Studio Hedgehog (2023.1.1) ou supérieur
- JDK 11 ou supérieur
- Android SDK 34 (Android 14) ou supérieur
- Kotlin 1.9 ou supérieur

## 🚀 Installation

1. Clonez ce dépôt :
```bash
git clone https://github.com/VOTRE_USERNAME/businesscard.git
```

2. Ouvrez le projet dans Android Studio

3. Laissez Gradle synchroniser les dépendances

4. Exécutez l'application sur un émulateur ou un appareil physique

## 📱 Configuration minimale

- **Min SDK** : 34 (Android 14.0)
- **Target SDK** : 35 (Android 15.0)
- **Compile SDK** : 35

## 🎯 Structure du projet

```
businesscard/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/businesscard/
│   │   │   │   ├── MainActivity.kt          # Activité principale
│   │   │   │   └── ui/theme/                # Thème de l'application
│   │   │   └── res/
│   │   │       ├── drawable/
│   │   │       │   └── android_logo.xml     # Logo Android vectoriel
│   │   │       ├── values/
│   │   │       │   ├── colors.xml           # Couleurs de l'app
│   │   │       │   └── strings.xml          # Chaînes de caractères
│   │   │       └── AndroidManifest.xml
│   │   └── build.gradle.kts
│   └── build.gradle.kts
└── README.md
```

## 🎨 Personnalisation

### Modifier les informations personnelles

Éditez le fichier `res/values/strings.xml` :

```xml
<string name="full_name">Votre Nom</string>
<string name="job_title">Votre Titre</string>
<string name="phone_number">Votre Numéro</string>
<string name="email_address">votre@email.com</string>
```

### Modifier les couleurs

Éditez le fichier `res/values/colors.xml` :

```xml
<color name="android_green">#3DDC84</color>
<color name="background_dark">#073042</color>
```

## 📸 Captures d'écran

L'application affiche :
- Section supérieure : Logo Android, nom et titre
- Section inférieure : Coordonnées avec icônes (téléphone, réseaux sociaux, email)

## 🤝 Contribution

Les contributions sont les bienvenues ! N'hésitez pas à :

1. Forker le projet
2. Créer une branche pour votre fonctionnalité (`git checkout -b feature/AmazingFeature`)
3. Commiter vos changements (`git commit -m 'Add some AmazingFeature'`)
4. Pousser vers la branche (`git push origin feature/AmazingFeature`)
5. Ouvrir une Pull Request

## 📝 Licence

Ce projet est sous licence MIT. Voir le fichier `LICENSE` pour plus de détails.

## 👤 Auteur

**Votre Nom**

- GitHub: [@votre-username](https://github.com/votre-username)

## 🙏 Remerciements

- [Android Developers](https://developer.android.com/)
- [Jetpack Compose](https://developer.android.com/jetpack/compose)
- [Material Design](https://material.io/design)

---

⭐️ N'oubliez pas de mettre une étoile si ce projet vous a aidé !

