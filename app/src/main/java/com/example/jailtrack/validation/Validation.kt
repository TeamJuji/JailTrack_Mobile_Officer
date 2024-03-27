package com.example.jailtrack.validation

class Validation {
    companion object {
        fun validateField(vararg fields: String): Boolean {
            var isValid = true
            for(field in fields){
                if (field.isEmpty() || field.isBlank()){
                    isValid = false
                }
            }
            return isValid
        }
    }
}