-- Table des utilisateurs
CREATE TABLE users (
    id BIGSERIAL PRIMARY KEY,
    first_name VARCHAR(100) NOT NULL,
    last_name VARCHAR(100) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE,
    phone_number VARCHAR(20) NOT NULL,
    role VARCHAR(20) NOT NULL,
    keycloak_id VARCHAR(36) UNIQUE,
    created_at TIMESTAMP NOT NULL,
    updated_at TIMESTAMP NOT NULL
);

-- Table des médecins
CREATE TABLE doctors (
    id BIGINT PRIMARY KEY REFERENCES users(id),
    specialization VARCHAR(100) NOT NULL,
    license_number VARCHAR(50) NOT NULL UNIQUE,
    biography TEXT
);

-- Table des patients
CREATE TABLE patients (
    id BIGINT PRIMARY KEY REFERENCES users(id),
    birth_date DATE NOT NULL,
    address TEXT NOT NULL,
    medical_history TEXT,
    emergency_contact VARCHAR(255) NOT NULL
);

-- Index pour améliorer les performances
CREATE INDEX idx_users_email ON users(email);
CREATE INDEX idx_users_keycloak_id ON users(keycloak_id);
CREATE INDEX idx_doctors_license ON doctors(license_number);