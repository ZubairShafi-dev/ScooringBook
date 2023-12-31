package com.enfotrix.scooringbook.models

data class MatchModel(
    val matchID: String,
    val teamAID: String,
    val teamBID: String,
    val tournamentID: String,
    val stadiumID: String,
    val dot: String,
    val single: String,
    val double: String,
    val three: String,
    val four: String,
    val six: String,
    val wideBall: String,
    val noBall: String,
    val extras: String,
    val wicket: String,
    val weatherConditions: String,
    val umpireIDs: String,
    val matchResult: String,
    val playerOfTheMatch: String,
    val matchDuration: String,
    val audianceAttendance: String,
    val broadCastingNetwork: String,
    val inningsResult: String,
    val tossDecision: String,
    val matchOfficals: String,
    val strikeP1ID: String,
    val strikeP2ID: String,
    val bowlerPId: String,
    val wicketKeeperPlayerPID: String,
    val playerStats: String,
    val matchRunRate: String,
    val requiredRunRate: String,
    val DLS_method: String,
    val matchFormat: String,
    val matchStatus: String,
    val matchDate: String,
    val matchTitle: String,
    val NumberofPlayers: String,
    val scorerID: String,
    val ballType: String,

    )
