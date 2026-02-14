--liquibase formatted sql
--changeset pedro:202602141942
--comment: add priority column to cards table
ALTER TABLE CARDS ADD COLUMN CARD_PRIORITY VARCHAR(10) DEFAULT 'LOW';