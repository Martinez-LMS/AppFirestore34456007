package br.edu.up.rgm34456007.viewmodel

import androidx.lifecycle.ViewModel
import br.edu.up.rgm34456007.Filters

/**
 * ViewModel for [com.google.firebase.example.fireeats.MainActivity].
 */

class MainActivityViewModel : ViewModel() {

    var isSigningIn: Boolean = false
    var filters: Filters = Filters.default
}
