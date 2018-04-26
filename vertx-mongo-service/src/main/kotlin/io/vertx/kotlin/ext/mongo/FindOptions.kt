package io.vertx.kotlin.ext.mongo

import io.vertx.ext.mongo.FindOptions

fun FindOptions(
  batchSize: Int? = null,
  fields: io.vertx.core.json.JsonObject? = null,
  limit: Int? = null,
  skip: Int? = null,
  sort: io.vertx.core.json.JsonObject? = null): FindOptions = io.vertx.ext.mongo.FindOptions().apply {

  if (batchSize != null) {
    this.setBatchSize(batchSize)
  }
  if (fields != null) {
    this.setFields(fields)
  }
  if (limit != null) {
    this.setLimit(limit)
  }
  if (skip != null) {
    this.setSkip(skip)
  }
  if (sort != null) {
    this.setSort(sort)
  }
}

