package Components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dotapage.R
import com.example.dotapage.ui.theme.AppTheme

@Composable
fun InstallButton (modifier: Modifier = Modifier) {
    var isButtonPressed by remember { mutableStateOf(false) }

    Button(
        onClick = { isButtonPressed = !isButtonPressed },
        modifier = modifier
            .size(width = 327.dp, height = 64.dp),
        shape = RoundedCornerShape(12.dp),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = if (isButtonPressed) {
                AppTheme.ButtonColors.secondary
            } else {
                AppTheme.ButtonColors.primary
            }
        )
    ) {
        Text(stringResource(R.string.button_install),fontSize=20.sp)
    }
}