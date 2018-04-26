package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.EventListOptions
import io.vertx.ext.consul.BlockingQueryOptions

fun EventListOptions(
  blockingOptions: io.vertx.ext.consul.BlockingQueryOptions? = null,
  name: String? = null): EventListOptions = io.vertx.ext.consul.EventListOptions().apply {

  if (blockingOptions != null) {
    this.setBlockingOptions(blockingOptions)
  }
  if (name != null) {
    this.setName(name)
  }
}

