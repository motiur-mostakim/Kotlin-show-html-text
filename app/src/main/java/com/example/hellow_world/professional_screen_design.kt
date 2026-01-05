package com.example.hellow_world

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.AddTask
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Image
import androidx.compose.material.icons.filled.Mic
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.BottomAppBarDefaults
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfessionalScreenDesign(modifier: Modifier = Modifier) {
    val showDialog = remember { mutableStateOf(false) }
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text("Home Page", style = MaterialTheme.typography.titleLarge)
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary,
                ),
            )
        },
        floatingActionButton = {
            FloatingActionButton(onClick = {
                showDialog.value = true
            }, content = {
                Icon(Icons.Filled.Add, contentDescription = null)
            })
        },
        bottomBar = {
            BottomAppBar {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 12.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    IconButton(onClick = {}) {
                        Icon(
                            Icons.Filled.Check,
                            contentDescription = null,
                            modifier = modifier.size(30.dp)
                        )
                    }
                    IconButton(onClick = {}) {
                        Icon(
                            Icons.Filled.Edit,
                            contentDescription = null,
                            modifier = modifier.size(30.dp)
                        )
                    }
                    IconButton(onClick = {}) {
                        Icon(
                            Icons.Filled.Mic,
                            contentDescription = null,
                            modifier = modifier.size(30.dp)
                        )
                    }
                    IconButton(onClick = {}) {
                        Icon(
                            Icons.Filled.Image,
                            contentDescription = null,
                            modifier = modifier.size(30.dp)
                        )
                    }
                }
            }
        }

    ) {
        Column(
            modifier = modifier
                .padding(it)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                "Motiur-Mostakim",
                style = TextStyle(fontSize = 30.sp, fontWeight = FontWeight.Bold)
            )
        }
        if (showDialog.value) {
            DialogExample(onDismiss = { showDialog.value = false })
        }
    }
}

@Composable
fun DialogExample(modifier: Modifier = Modifier, onDismiss: () -> Unit) {
    AlertDialog(
        title = { Text("Motiur-Mostakim", style = MaterialTheme.typography.titleLarge) },
        text = { Text("This is Motiur-Mostakim", style = MaterialTheme.typography.bodyMedium) },
        onDismissRequest = onDismiss,
        confirmButton = {
            TextButton(onClick = onDismiss) {
                Text("OK")
            }
        },
        icon = { Icon(Icons.Filled.AddTask, contentDescription = null) }
    )
}

@Preview(showBackground = true)
@Composable
private fun ProfessionalScreenDesignPreview() {
    ProfessionalScreenDesign()
}