package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.AclToken
import io.vertx.ext.consul.AclTokenType

fun AclToken(
  id: String? = null,
  name: String? = null,
  rules: String? = null,
  type: AclTokenType? = null): AclToken = io.vertx.ext.consul.AclToken().apply {

  if (id != null) {
    this.setId(id)
  }
  if (name != null) {
    this.setName(name)
  }
  if (rules != null) {
    this.setRules(rules)
  }
  if (type != null) {
    this.setType(type)
  }
}

