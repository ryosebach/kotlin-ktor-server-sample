package repository

import entity.Example
import java.time.LocalDateTime

interface ExampleRepository {
    fun findOneById(id: Long): Example?

    fun findOneByKey(exampleKey: String): Example?

    fun findList(
        limit: Int,
        offset: Int,
        enabled: Boolean?
    ): List<Example>

    fun create(
        exampleKey: String,
        nameJa: String,
        nameEn: String,
        nameKo: String,
        nameZh: String,
        enabled: Boolean,
        createdAt: LocalDateTime,
        updatedAt: LocalDateTime
    ): Long

    fun updateById(
        id: Long,
        nameJa: String?,
        nameEn: String?,
        nameKo: String?,
        nameZh: String?,
        enabled: Boolean?,
        updatedAt: LocalDateTime
    ): Boolean
}
