import androidx.compose.foundation.layout.*

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.agenda.CardForm
import com.example.agenda.ListaData
import com.example.agenda.ui.theme.AgendaTheme

val cardForm = CardForm()

@Preview(showBackground = true)
@Composable
fun CardPreview() {
    AgendaTheme {
        // Mostra duas instâncias de ListaCard para visualização
        Column(
            modifier = Modifier.fillMaxSize().padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            val listaData1 = ListaData(
                titulo = "Comprar mantimentos",
                descricao = "Ir ao mercado e comprar leite, pão e ovos.",
                feito = false
            )

            val listaData2 = ListaData(
                titulo = "Estudar Kotlin",
                descricao = "Revisar classes e funções em Kotlin.",
                feito = true
            )

            cardForm.ListaCard(
                lista = listaData1,
                modifier = Modifier.fillMaxWidth()
            )

            // Espaço entre as instâncias de ListaCard
            Spacer(modifier = Modifier.height(16.dp))

            cardForm.ListaCard(
                lista = listaData2,
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}
