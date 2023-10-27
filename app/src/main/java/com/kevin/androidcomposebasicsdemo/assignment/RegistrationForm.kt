package com.kevin.androidcomposebasicsdemo.assignment

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun RegistrationForm() {

    var userName by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }
    var confirmPassword by remember {
        mutableStateOf("")
    }

    Column(Modifier.padding(20.dp)) {
        TextField(
            value = userName,
            modifier = Modifier.fillMaxWidth(),
            onValueChange = { userName = it },
            placeholder = { Text(text = "Enter user name") }
        )
        Spacer(modifier = Modifier.size(10.dp))

        TextField(
            value = password,
            modifier = Modifier.fillMaxWidth(),
            onValueChange = { password = it },
            visualTransformation = PasswordVisualTransformation(),
            placeholder = { Text(text = "Enter password") }
        )
        Spacer(modifier = Modifier.size(10.dp))

        TextField(
            value = confirmPassword,
            modifier = Modifier.fillMaxWidth(),
            onValueChange = { confirmPassword = it },
            visualTransformation = PasswordVisualTransformation(),
            placeholder = { Text(text = " Confirm password") }
        )
        Spacer(modifier = Modifier.size(10.dp))

        Button(onClick = { }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "Register")
        }

    }

}