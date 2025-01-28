# MobiDoc

Application de gestion de consultations médicales à domicile

## Architecture

Le projet est composé de :

### Backend (Spring Boot Microservices)
- `user-service` : Gestion des utilisateurs et profils
- `auth-service` : Service d'authentification (Keycloak)
- `consultation-service` : Gestion des consultations
- `notification-service` : Gestion des notifications
- `evaluation-service` : Gestion des évaluations
- `location-service` : Service de géolocalisation
- `stats-service` : Service de statistiques

### Frontend
- `web-app` : Application web Angular (SPA)
- `mobile-app` : Application mobile Flutter avec GetX

### Infrastructure
- `docker` : Fichiers Docker et docker-compose
- `k8s` : Configurations Kubernetes

## Prérequis

- Java 17+
- Node.js 18+
- Flutter 3.x
- Docker & Docker Compose
- PostgreSQL 15+
- Keycloak 22+

## Installation

```bash
# Cloner le repository
git clone https://github.com/fagah/mobidoc-by-claude.git

# Lancer l'infrastructure
cd docker
docker-compose up -d

# Lancer les services backend
./mvnw spring-boot:run  # Pour chaque service

# Lancer l'application web
cd web-app
npm install
ng serve

# Lancer l'application mobile
cd mobile-app
flutter pub get
flutter run
```