/**
 * Swagger Petstore
 * This is a sample server Petstore server.  You can find out more about Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/).  For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 */


package io.swagger.server.api

import io.swagger.server.model.User

import java.io.File

import org.scalatra.ScalatraServlet
import org.scalatra.swagger._
import org.json4s._
import org.json4s.JsonDSL._
import org.scalatra.json.{ JValueResult, JacksonJsonSupport }
import org.scalatra.servlet.{ FileUploadSupport, MultipartConfig, SizeConstraintExceededException }

import scala.collection.JavaConverters._

class UserApi(implicit val swagger: Swagger) extends ScalatraServlet
  with FileUploadSupport
  with JacksonJsonSupport
  with SwaggerSupport {
  protected implicit val jsonFormats: Formats = DefaultFormats

  protected val applicationDescription: String = "UserApi"

  before() {
    contentType = formats("json")
    response.headers += ("Access-Control-Allow-Origin" -> "*")
  }
  

  val createUserOperation = (apiOperation[Unit]("createUser")
      summary "Create user"
      parameters(bodyParam[User]("user").description(""))
  )

  post("/user",operation(createUserOperation)) {
    
    
          val user = parsedBody.extract[User]

    println("user: " + user)
  }

  

  val createUsersWithArrayInputOperation = (apiOperation[Unit]("createUsersWithArrayInput")
      summary "Creates list of users with given input array"
      parameters(bodyParam[List[User]]("user").description(""))
  )

  post("/user/createWithArray",operation(createUsersWithArrayInputOperation)) {
    
    
          val user = parsedBody.extract[List[User]]

    println("user: " + user)
  }

  

  val createUsersWithListInputOperation = (apiOperation[Unit]("createUsersWithListInput")
      summary "Creates list of users with given input array"
      parameters(bodyParam[List[User]]("user").description(""))
  )

  post("/user/createWithList",operation(createUsersWithListInputOperation)) {
    
    
          val user = parsedBody.extract[List[User]]

    println("user: " + user)
  }

  

  val deleteUserOperation = (apiOperation[Unit]("deleteUser")
      summary "Delete user"
      parameters(pathParam[String]("username").description(""))
  )

  delete("/user/:username",operation(deleteUserOperation)) {
    
    
      val username = params.getOrElse("username", halt(400))
    
    println("username: " + username)
  }

  

  val getUserByNameOperation = (apiOperation[User]("getUserByName")
      summary "Get user by user name"
      parameters(pathParam[String]("username").description(""))
  )

  get("/user/:username",operation(getUserByNameOperation)) {
    
    
      val username = params.getOrElse("username", halt(400))
    
    println("username: " + username)
  }

  

  val loginUserOperation = (apiOperation[String]("loginUser")
      summary "Logs user into the system"
      parameters(queryParam[String]("username").description(""), queryParam[String]("password").description(""))
  )

  get("/user/login",operation(loginUserOperation)) {
    
    
                val username = params.getAs[String]("username")

    println("username: " + username)
    
    
                val password = params.getAs[String]("password")

    println("password: " + password)
  }

  

  val logoutUserOperation = (apiOperation[Unit]("logoutUser")
      summary "Logs out current logged in user session"
      parameters()
  )

  get("/user/logout",operation(logoutUserOperation)) {
  }

  

  val updateUserOperation = (apiOperation[Unit]("updateUser")
      summary "Updated user"
      parameters(pathParam[String]("username").description(""), bodyParam[User]("user").description(""))
  )

  put("/user/:username",operation(updateUserOperation)) {
    
    
      val username = params.getOrElse("username", halt(400))
    
    println("username: " + username)
    
    
          val user = parsedBody.extract[User]

    println("user: " + user)
  }

}
