package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.Check
import io.vertx.ext.consul.CheckStatus

fun Check(
  id: String? = null,
  name: String? = null,
  nodeName: String? = null,
  notes: String? = null,
  output: String? = null,
  serviceId: String? = null,
  serviceName: String? = null,
  status: CheckStatus? = null): Check = io.vertx.ext.consul.Check().apply {

  if (id != null) {
    this.setId(id)
  }
  if (name != null) {
    this.setName(name)
  }
  if (nodeName != null) {
    this.setNodeName(nodeName)
  }
  if (notes != null) {
    this.setNotes(notes)
  }
  if (output != null) {
    this.setOutput(output)
  }
  if (serviceId != null) {
    this.setServiceId(serviceId)
  }
  if (serviceName != null) {
    this.setServiceName(serviceName)
  }
  if (status != null) {
    this.setStatus(status)
  }
}

