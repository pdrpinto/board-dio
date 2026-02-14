package br.com.dio.dto;

import br.com.dio.persistence.entity.CardPriority;

import java.time.OffsetDateTime;

public record CardDetailsDTO(Long id,
                             String title,
                             String description,
                             boolean blocked,
                             OffsetDateTime blockedAt,
                             String blockReason,
                             int blocksAmount,
                             Long columnId,
                             String columnName,
                             CardPriority priority
) {
}
