package com.prystupa.matching

/**
 * Created with IntelliJ IDEA.
 * User: eprystupa
 * Date: 1/5/13
 * Time: 3:10 PM
 */

sealed trait PriceLevel

case class LimitPrice(limit: Double) extends PriceLevel
