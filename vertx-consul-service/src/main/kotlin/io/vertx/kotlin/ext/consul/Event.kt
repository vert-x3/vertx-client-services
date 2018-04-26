package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.Event

fun Event(
  id: String? = null,
  lTime: Int? = null,
  name: String? = null,
  node: String? = null,
  payload: String? = null,
  service: String? = null,
  tag: String? = null,
  version: Int? = null): Event = io.vertx.ext.consul.Event().apply {

  if (id != null) {
    this.setId(id)
  }
  if (lTime != null) {
    this.setLTime(lTime)
  }
  if (name != null) {
    this.setName(name)
  }
  if (node != null) {
    this.setNode(node)
  }
  if (payload != null) {
    this.setPayload(payload)
  }
  if (service != null) {
    this.setService(service)
  }
  if (tag != null) {
    this.setTag(tag)
  }
  if (version != null) {
    this.setVersion(version)
  }
}

