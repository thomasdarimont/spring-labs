package hello

import scala.beans.BeanProperty

//@BeanProperty is required in order to have Java Bean Style getter/setter that can be inspected by Spring
case class Greeting(@BeanProperty id: Int, @BeanProperty content: String)