package com.chengang.ch12

import java.lang.{Iterable => JavaIterable}
import java.nio.file.Paths
import java.util.Arrays
import java.util.concurrent.TimeUnit

import com.chengang.Logging
import org.cfg4j.provider.{ConfigurationProvider, ConfigurationProviderBuilder}
import org.cfg4j.source.ConfigurationSource
import org.cfg4j.source.context.environment.ImmutableEnvironment
import org.cfg4j.source.context.filesprovider.ConfigFilesProvider
import org.cfg4j.source.files.FilesConfigurationSource
import org.cfg4j.source.reload.strategy.PeriodicalReloadStrategy

/**
  * Created by che on 2/5/2019.
  */
object Gist extends App with Logging {

  // Specify which files to load. Configuration from both files will be merged.// Specify which files to load. Configuration from both files will be merged.

  val configFilesProvider: ConfigFilesProvider = new ConfigFilesProvider {
    def getConfigFiles(): JavaIterable[java.nio.file.Path] = {
      Arrays.asList(Paths.get("common_conf.properties"))
    }
  }

  //val configFilesProvider: ConfigFilesProvider @unchecked = () -> new Iterable(Paths.get("application.properties"), Paths.get("otherConfig.properties"))
  // Use local files as configuration store
  val source: ConfigurationSource = new FilesConfigurationSource(configFilesProvider)

  // (optional) Select path to use
  val environment = new ImmutableEnvironment("C:\\src\\IdeaProjects\\chen-gang-scala-for-impatient\\conf")

  // (optional) Reload configuration every 5 seconds
  val reloadStrategy = new PeriodicalReloadStrategy(5, TimeUnit.SECONDS)

  // Create configuration provider backed by the source
  val provider: ConfigurationProvider = new ConfigurationProviderBuilder()
    .withConfigurationSource(source)
    .withReloadStrategy(new PeriodicalReloadStrategy(5, TimeUnit.SECONDS))
    .withEnvironment(environment)
    .build()

  val v1 = provider.getProperty("main.v1", classOf[Int])
  logInfo(v1.toString)


}
