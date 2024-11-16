-- V1__Create_properties_table.sql
CREATE TABLE properties (
    application VARCHAR(255) NOT NULL,
    profile VARCHAR(255) NOT NULL,
    key VARCHAR(255) NOT NULL,
    value TEXT,
    PRIMARY KEY (application, profile, key)
);