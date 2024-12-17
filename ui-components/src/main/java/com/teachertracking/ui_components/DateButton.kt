package com.teachertracking.ui_components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun DateButton(
    dayNumber: String,
    dayName: String,
    isSelected: Boolean,
    onClick: () -> Unit
) {
    val backgroundColor = if (isSelected) Color(0xFF00C2A8) else Color.White
    val textColor = if (isSelected) Color.White else Color.Black

    Column(
        modifier = Modifier
            .padding(8.dp)
            .clickable { onClick() }
            .background(
                color = backgroundColor,
                shape = RoundedCornerShape(12.dp)
            )
            .padding(vertical = 8.dp, horizontal = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = dayNumber,
            style = MaterialTheme.typography.bodyLarge.copy(
                color = textColor,
                fontWeight = FontWeight.Bold
            )
        )
        Text(
            text = dayName,
            style = MaterialTheme.typography.bodyMedium.copy(
                color = textColor
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewDateButton() {
    DateButton(dayNumber = "5", dayName = "Sun", isSelected = true, onClick = {})
}