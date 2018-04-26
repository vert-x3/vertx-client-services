package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.ServiceOptions
import io.vertx.ext.consul.CheckOptions

fun ServiceOptions(
  address: String? = null,
  checkOptions: io.vertx.ext.consul.CheckOptions? = null,
  id: String? = null,
  name: String? = null,
  port: Int? = null,
  tags: Iterable<String>? = null): ServiceOptions = io.vertx.ext.consul.ServiceOptions().apply {

  if (address != null) {
    this.setAddress(address)
  }
  if (checkOptions != null) {
    this.setCheckOptions(checkOptions)
  }
  if (id != null) {
    this.setId(id)
  }
  if (name != null) {
    this.setName(name)
  }
  if (port != null) {
    this.setPort(port)
  }
  if (tags != null) {
    this.setTags(tags.toList())
  }
}

