# Guide de Publication sur GitHub 🚀

Ce guide vous explique comment publier votre application Business Card sur GitHub.

## 📋 Prérequis

1. Un compte GitHub (créez-en un sur [github.com](https://github.com) si nécessaire)
2. Git installé sur votre ordinateur
   - Téléchargez depuis [git-scm.com](https://git-scm.com/)
   - Vérifiez l'installation : `git --version`

## 🔧 Configuration Git (première fois uniquement)

Si c'est votre première utilisation de Git, configurez votre identité :

```bash
git config --global user.name "Votre Nom"
git config --global user.email "votre.email@example.com"
```

## 📤 Étapes de Publication

### 1. Initialiser le dépôt Git local

Ouvrez un terminal dans le dossier du projet et exécutez :

```bash
# Initialiser Git
git init

# Ajouter tous les fichiers
git add .

# Créer le premier commit
git commit -m "Initial commit: Business Card App"
```

### 2. Créer un dépôt sur GitHub

1. Allez sur [github.com](https://github.com)
2. Cliquez sur le bouton **"+"** en haut à droite
3. Sélectionnez **"New repository"**
4. Remplissez les informations :
   - **Repository name** : `businesscard`
   - **Description** : "Application Android de carte de visite avec Jetpack Compose"
   - Laissez le dépôt **Public**
   - **Ne cochez PAS** "Initialize this repository with a README" (car nous en avons déjà un)
5. Cliquez sur **"Create repository"**

### 3. Lier votre dépôt local à GitHub

GitHub vous donnera des instructions. Utilisez la section "push an existing repository" :

```bash
# Ajouter l'URL du dépôt distant (remplacez USERNAME par votre nom d'utilisateur GitHub)
git remote add origin https://github.com/USERNAME/businesscard.git

# Renommer la branche principale en main (convention moderne)
git branch -M main

# Pousser le code vers GitHub
git push -u origin main
```

### 4. Vérification

Rafraîchissez la page GitHub de votre dépôt. Vous devriez voir :
- Tous vos fichiers
- Le README.md affiché automatiquement
- L'historique des commits

## 🌐 Partager votre projet

Votre lien GitHub sera :
```
https://github.com/VOTRE_USERNAME/businesscard
```

Partagez ce lien pour que d'autres puissent voir et cloner votre projet !

## 📝 Commandes Git utiles pour la suite

### Ajouter des modifications

```bash
# Voir l'état des fichiers
git status

# Ajouter des fichiers modifiés
git add .

# Créer un commit
git commit -m "Description des modifications"

# Pousser vers GitHub
git push
```

### Cloner le projet sur un autre ordinateur

```bash
git clone https://github.com/VOTRE_USERNAME/businesscard.git
```

## 🎯 Exemple complet de A à Z

Voici toutes les commandes à exécuter dans l'ordre (dans le terminal, depuis le dossier du projet) :

```bash
# 1. Initialiser Git
git init

# 2. Ajouter tous les fichiers
git add .

# 3. Premier commit
git commit -m "Initial commit: Business Card App with Jetpack Compose"

# 4. Ajouter le dépôt distant (REMPLACEZ USERNAME!)
git remote add origin https://github.com/USERNAME/businesscard.git

# 5. Renommer la branche
git branch -M main

# 6. Pousser vers GitHub
git push -u origin main
```

## ⚠️ Problèmes courants

### Erreur d'authentification

Si vous avez une erreur d'authentification :
1. Allez dans **Settings** > **Developer settings** > **Personal access tokens** sur GitHub
2. Générez un token avec les permissions `repo`
3. Utilisez ce token comme mot de passe lors du push

### Le fichier local.properties

Ce fichier est automatiquement ignoré par `.gitignore` car il contient des chemins spécifiques à votre machine.

## 🎉 Félicitations !

Votre application est maintenant sur GitHub ! Vous pouvez :
- Partager le lien avec d'autres
- Collaborer avec d'autres développeurs
- Ajouter des releases
- Suivre les modifications avec l'historique Git

---

**Besoin d'aide ?** Consultez la [documentation Git](https://git-scm.com/doc) ou la [documentation GitHub](https://docs.github.com/).

