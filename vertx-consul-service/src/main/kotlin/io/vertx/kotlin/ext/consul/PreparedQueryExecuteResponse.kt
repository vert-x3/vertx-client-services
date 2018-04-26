package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.PreparedQueryExecuteResponse
import io.vertx.ext.consul.ServiceEntry

fun PreparedQueryExecuteResponse(
  dc: String? = null,
  dnsTtl: String? = null,
  failovers: Int? = null,
  nodes: Iterable<io.vertx.ext.consul.ServiceEntry>? = null,
  service: String? = null): PreparedQueryExecuteResponse = io.vertx.ext.consul.PreparedQueryExecuteResponse().apply {

  if (dc != null) {
    this.setDc(dc)
  }
  if (dnsTtl != null) {
    this.setDnsTtl(dnsTtl)
  }
  if (failovers != null) {
    this.setFailovers(failovers)
  }
  if (nodes != null) {
    this.setNodes(nodes.toList())
  }
  if (service != null) {
    this.setService(service)
  }
}

