package com.example.fore.ui

import android.graphics.pdf.PdfDocument.Page
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DataFrom(
    goToNextPage: (MutableList<String>) -> Unit,
){
    var txtNama by remember{
        mutableStateOf("")
    }

    var txtUmur by remember {
        mutableStateOf("")
    }

    var txtALamat by remember {
        mutableStateOf("")
    }

    var txtPekerjaan by remember {
        mutableStateOf("")
    }

    val listData = mutableListOf<String>(txtNama, txtUmur, txtALamat, txtPekerjaan)

    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
            .background(color = Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Text(
            text = "Data Customer",
            modifier = Modifier.padding(20.dp),
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
        OutlinedTextField(
            value = txtNama,
            onValueChange = {
                txtNama = it
            },
            label = { Text(text = "Nama")}
        )
        OutlinedTextField(
            value = txtUmur,
            onValueChange = {
                txtUmur = it
            } ,
            label = { Text(text = "Umur")}
        )
        OutlinedTextField(
            value = txtALamat ,
            onValueChange ={
                txtALamat = it
            },
            label = { Text(text = "Alamat")}
        )
        OutlinedTextField(
            value = txtPekerjaan ,
            onValueChange = {
                txtPekerjaan = it
            },
            label = { Text(text = "Pekerjaan")}
        )


    }
}