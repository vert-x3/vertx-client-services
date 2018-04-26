package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.Service

fun Service(
  address: String? = null,
  id: String? = null,
  name: String? = null,
  node: String? = null,
  nodeAddress: String? = null,
  port: Int? = null,
  tags: Iterable<String>? = null): Service = io.vertx.ext.consul.Service().apply {

  if (address != null) {
    this.setAddress(address)
  }
  if (id != null) {
    this.setId(id)
  }
  if (name != null) {
    this.setName(name)
  }
  if (node != null) {
    this.setNode(node)
  }
  if (nodeAddress != null) {
    this.setNodeAddress(nodeAddress)
  }
  if (port != null) {
    this.setPort(port)
  }
  if (tags != null) {
    this.setTags(tags.toList())
  }
}

