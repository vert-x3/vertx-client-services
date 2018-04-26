package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.PreparedQueryDefinition

fun PreparedQueryDefinition(
  dcs: Iterable<String>? = null,
  dnsTtl: String? = null,
  id: String? = null,
  meta: Map<String, String>? = null,
  name: String? = null,
  nearestN: Int? = null,
  passing: Boolean? = null,
  service: String? = null,
  session: String? = null,
  tags: Iterable<String>? = null,
  templateRegexp: String? = null,
  templateType: String? = null,
  token: String? = null): PreparedQueryDefinition = io.vertx.ext.consul.PreparedQueryDefinition().apply {

  if (dcs != null) {
    this.setDcs(dcs.toList())
  }
  if (dnsTtl != null) {
    this.setDnsTtl(dnsTtl)
  }
  if (id != null) {
    this.setId(id)
  }
  if (meta != null) {
    this.setMeta(meta)
  }
  if (name != null) {
    this.setName(name)
  }
  if (nearestN != null) {
    this.setNearestN(nearestN)
  }
  if (passing != null) {
    this.setPassing(passing)
  }
  if (service != null) {
    this.setService(service)
  }
  if (session != null) {
    this.setSession(session)
  }
  if (tags != null) {
    this.setTags(tags.toList())
  }
  if (templateRegexp != null) {
    this.setTemplateRegexp(templateRegexp)
  }
  if (templateType != null) {
    this.setTemplateType(templateType)
  }
  if (token != null) {
    this.setToken(token)
  }
}

