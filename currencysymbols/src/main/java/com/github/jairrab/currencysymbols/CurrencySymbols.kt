package com.github.jairrab.currencysymbols

import android.icu.util.Currency
import java.util.HashMap

object CurrencySymbols {
    fun get(currency: String): String {
        return try {
            hashMap[currency]
                ?: let {
                    if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                        Currency.getInstance(currency).symbol
                    } else {
                        java.util.Currency.getInstance(currency).symbol
                    }
                }
        } catch (e: IllegalArgumentException) {
            currency
        }
    }

    private val hashMap:Map<String, String> = object : HashMap<String, String>() {
        init {
            put("AED", "DH")
            put("ALL", "Lek")
            put("ANG", "ƒ")
            put("ARS", "$")
            put("AUD", "$")
            put("AWG", "ƒ")
            put("AZN", "\u20BC") //per email from Idris Guluzade
            put("BAM", "KM")
            put("BBD", "$")
            put("BGN", "лв")
            put("BMD", "$")
            put("BND", "$")
            put("BOB", "\$b")
            put("BRL", "R$")
            put("BSD", "$")
            put("BWP", "P")
            put("BYN", "Br")
            put("BYR", "p.")
            put("BZD", "BZ$")
            put("CAD", "$")
            put("CHF", "CHF")
            put("CLP", "$")
            put("CNY", "¥")
            put("COP", "$")
            put("CRC", "₡")
            put("CUP", "₱")
            put("CZK", "Kč")
            put("DKK", "kr")
            put("DOP", "RD$")
            put("EGP", "£")
            put("EUR", "€")
            put("FJD", "$")
            put("FKP", "£")
            put("GBP", "£")
            put("GGP", "£")
            put("GHS", "¢")
            put("GIP", "£")
            put("GTQ", "Q")
            put("GYD", "$")
            put("HKD", "$")
            put("HNL", "L")
            put("HRK", "kn")
            put("HUF", "Ft")
            put("IDR", "Rp")
            put("ILS", "₪")
            put("IMP", "£")
            put("INR", "₹")
            put("IRR", "﷼")
            put("ISK", "kr")
            put("JEP", "£")
            put("JMD", "J$")
            put("JPY", "¥")
            put("KGS", "\u2286")
            put("KHR", "៛")
            put("KPW", "₩")
            put("KRW", "₩")
            put("KYD", "$")
            put("KZT", "₸")
            put("LAK", "₭")
            put("LBP", "£")
            put("LKR", "₨")
            put("LRD", "$")
            put("MKD", "ден")
            put("MNT", "₮")
            put("MOP", "MOP$") //as per Rafael Jose
            put("MUR", "₨")
            put("MXN", "$")
            put("MYR", "RM")
            put("MZN", "MT")
            put("NAD", "$")
            put("NGN", "₦")
            put("NIO", "C$")
            put("NOK", "kr")
            put("NPR", "₨")
            put("NZD", "$")
            put("OMR", "﷼")
            put("PAB", "B/.")
            put("PEN", "S/.")
            put("PHP", "₱")
            put("PKR", "₨")
            put("PLN", "zł")
            put("PYG", "Gs")
            put("QAR", "﷼")
            put("RON", "lei")
            put("RSD", "Дин.")
            put("RUB", "\u20BD")
            put("SAR", "﷼")
            put("SBD", "$")
            put("SCR", "₨")
            put("SEK", "kr")
            put("SGD", "$")
            put("SHP", "£")
            put("SOS", "S")
            put("SRD", "$")
            put("SVC", "$")
            put("SYP", "£")
            put("THB", "฿")
            put("TRY", "\u20BA")
            put("TTD", "TT$")
            put("TVD", "$")
            put("TWD", "NT$")
            put("UAH", "₴")
            put("USD", "$")
            put("UYU", "\$U")
            put("UZS", "лв")
            put("VEF", "Bs")
            put("VND", "₫")
            put("XCD", "$")
            put("XPF", "F")
            put("YER", "﷼")
            put("ZAR", "R")
            put("ZWD", "Z$")

            //cryptocurrencies
            put("BTC", "฿")
        }
    }
}