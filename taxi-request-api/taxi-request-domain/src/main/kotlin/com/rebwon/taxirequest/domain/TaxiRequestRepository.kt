package com.rebwon.taxirequest.domain

interface TaxiRequestRepository {

    fun save(taxiRequest: TaxiRequest)

    fun delete(taxiRequest: TaxiRequest)
}
