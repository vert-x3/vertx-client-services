package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.CheckOptions
import io.vertx.ext.consul.CheckStatus

fun CheckOptions(
  deregisterAfter: String? = null,
  http: String? = null,
  id: String? = null,
  interval: String? = null,
  name: String? = null,
  notes: String? = null,
  script: String? = null,
  serviceId: String? = null,
  status: CheckStatus? = null,
  tcp: String? = null,
  ttl: String? = null): CheckOptions = io.vertx.ext.consul.CheckOptions().apply {

  if (deregisterAfter != null) {
    this.setDeregisterAfter(deregisterAfter)
  }
  if (http != null) {
    this.setHttp(http)
  }
  if (id != null) {
    this.setId(id)
  }
  if (interval != null) {
    this.setInterval(interval)
  }
  if (name != null) {
    this.setName(name)
  }
  if (notes != null) {
    this.setNotes(notes)
  }
  if (script != null) {
    this.setScript(script)
  }
  if (serviceId != null) {
    this.setServiceId(serviceId)
  }
  if (status != null) {
    this.setStatus(status)
  }
  if (tcp != null) {
    this.setTcp(tcp)
  }
  if (ttl != null) {
    this.setTtl(ttl)
  }
}

