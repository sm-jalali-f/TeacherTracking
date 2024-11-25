package io.teachertracking.data.model

import java.math.BigDecimal
import java.time.LocalDateTime
import java.util.Currency

data class ClassSession(
    val id: Long,
    val student: Student,
    val place: Place,
    val cost: Cost,
    val date: String,
    val time:String
)

data class Place(
    val id: Long,
    val name: String

)

data class Cost(
    val value: BigDecimal?,
    val currency: Currency
)

data class Student(
    val id: Long,
    val firstName: String,
    val familyName: String?,
    val level: StudentLevel?
)
enum class StudentLevel(val level: Int) {
    STARTER(1),
    BEGINNER(2),
    PRE_INTERMEDIATE(3),
    INTERMEDIATE(4),
    ADVANCED(5),
    PROFICIENT(6);
}
