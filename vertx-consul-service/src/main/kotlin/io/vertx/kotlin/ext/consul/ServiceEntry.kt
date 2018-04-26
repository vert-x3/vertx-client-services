package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.ServiceEntry
import io.vertx.ext.consul.Check
import io.vertx.ext.consul.Node
import io.vertx.ext.consul.Service

fun ServiceEntry(
  checks: Iterable<io.vertx.ext.consul.Check>? = null,
  node: io.vertx.ext.consul.Node? = null,
  service: io.vertx.ext.consul.Service? = null): ServiceEntry = io.vertx.ext.consul.ServiceEntry().apply {

  if (checks != null) {
    this.setChecks(checks.toList())
  }
  if (node != null) {
    this.setNode(node)
  }
  if (service != null) {
    this.setService(service)
  }
}

