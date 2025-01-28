# MobiDoc

Application de gestion de documents médicaux avec téléconsultation.

## Architecture

Le projet est divisé en plusieurs parties :

### Backend (Spring Boot)
- API REST
- Microservices architecture
- PostgreSQL pour la persistance
- Keycloak pour l'authentification

### Frontend Web (Angular)
- Single Page Application
- Interface utilisateur moderne et responsive
- Intégration avec Keycloak

### Application Mobile (Flutter)
- Framework GetX pour la gestion d'état
- Support Android et iOS
- Interface native et performante

## Structure du Projet

```
├── backend/               # Services Spring Boot
├── frontend/              # Application Angular
├── mobile/                # Application Flutter
├── docker/                # Configuration Docker
└── docs/                  # Documentation
```

## Prérequis

- Java 17+
- Node.js 18+
- Flutter 3.x
- Docker et Docker Compose
- PostgreSQL 15+

## Installation

1. Cloner le repository
2. Lancer la base de données et Keycloak avec Docker Compose
3. Démarrer le backend Spring Boot
4. Lancer le frontend Angular
5. Compiler l'application mobile Flutter

## Documentation

Consulter le dossier `docs/` pour plus de détails sur :
- L'architecture détaillée
- Les guides d'installation
- Les API endpoints
- Les procédures de déploiement