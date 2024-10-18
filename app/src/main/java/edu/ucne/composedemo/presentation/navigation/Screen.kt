package edu.ucne.composedemo.presentation.navigation

import kotlinx.serialization.Serializable

sealed class Screen {
    @Serializable
    data object TicketList : Screen()
    @Serializable
    data class Ticket(val ticketId: Int) : Screen()
    @Serializable
    data object SistemaList : Screen()
    @Serializable
    data object ClienteList : Screen()
    @Serializable
    data object SuplidoresGastoList: Screen()
}