//
// Animal.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation

public struct Animal: Codable {

    public private(set) var className: String
    public private(set) var color: String? = "red"

    public init(className: String, color: String? = "red") {
        self.className = className
        self.color = color
    }

}
