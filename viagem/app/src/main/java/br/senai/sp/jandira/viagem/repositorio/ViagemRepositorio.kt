package br.senai.sp.jandira.viagem.repositorio

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import br.senai.sp.jandira.viagem.R
import br.senai.sp.jandira.viagem.model.Viagem
import java.time.LocalDate

class ViagemRepositorio {

    @Composable
    fun listarTodasAsViagens(): List <Viagem> {

        val londres = Viagem(
            id = 1,
            destino = "Londres",
            descricao = "London is the capital and largest city of  the United Kingdom, with a population of just under 9 million.",
            dataChegada = LocalDate.of(2019, 2, 18),
            dataPartida = LocalDate.of(2019, 2, 21),
            imagem = painterResource(id = R.drawable.london)
        )

        val cachoeiraDoSul = Viagem(
            id = 2,
            destino = "Cachoeira do Sul - RS",
            descricao = "Bagui rural.",
            dataChegada = LocalDate.of(2024, 1, 2),
            dataPartida = LocalDate.of(2024, 1, 12),
        )

        val roma = Viagem(
            id = 3,
            destino = "Roma",
            descricao = "Roma, a capital da Itália, é uma cidade cosmopolita, enorme, com quase 3.000 anos de arte.",
            dataChegada = LocalDate.of(2020, 6, 19),
            dataPartida = LocalDate.of(2020, 7, 19),
            imagem = painterResource(id = R.drawable.roma)
        )

        val toronto = Viagem(
            id = 4,
            destino = "Toronto",
            descricao = "Toronto, a capital da província de Ontário, é uma grande cidade canadense localizada ao longo da costa noroeste do Lago Ontário.",
            dataChegada = LocalDate.of(2022, 2, 26),
            dataPartida = LocalDate.of(2022, 4, 9),
            imagem = painterResource(id = R.drawable.toronto)
        )

        val lisboa = Viagem(
            id = 5,
            destino = "Lisboa",
            descricao = "Lisboa é a capital de Portugal, situada na costa.",
            dataChegada = LocalDate.of(2018, 10, 20),
            dataPartida = LocalDate.of(2018, 11, 5)
        )

        return listOf(londres, cachoeiraDoSul, lisboa, toronto, roma)

    }

}