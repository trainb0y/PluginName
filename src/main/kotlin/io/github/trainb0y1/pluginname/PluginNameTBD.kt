package io.github.trainb0y1.pluginname

import org.bukkit.plugin.java.JavaPlugin


class PluginNameTBD: JavaPlugin() {
	companion object {
		lateinit var plugin: PluginNameTBD
			private set
	}

	override fun onEnable() {
		plugin = this
	}
}