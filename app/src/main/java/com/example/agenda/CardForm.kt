package com.example.agenda

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.Checkbox
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class CardForm {
    @Composable
    fun ListaCard(
        lista: ListaData,
        modifier: Modifier = Modifier
    ) {
        Card(
            modifier = modifier.fillMaxWidth().padding(16.dp),
        ) {
            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                // Título da tarefa
                Text(text = lista.titulo, style = MaterialTheme.typography.bodyLarge)

                // Descrição da tarefa
                Spacer(modifier = Modifier.height(8.dp))
                Text(text = lista.descricao, style = MaterialTheme.typography.bodyLarge)

                // Caixa de seleção para indicar se a tarefa foi realizada
                Spacer(modifier = Modifier.height(16.dp))
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Checkbox(
                        checked = lista.feito,
                        onCheckedChange = { /* lógica para alterar o estado da tarefa */ }
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(text = "Realizada", style = MaterialTheme.typography.bodyLarge)
                }
            }
        }
    }
}