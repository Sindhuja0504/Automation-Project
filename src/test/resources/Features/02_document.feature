Feature: Validate  Document Upload Page

  Scenario: Uploading valid documents with correct format and size
    Given In document upload page
    When upload national id document
    And upload passport size photo document
    And upload other require documents
    Then Documents should be accepted and the application should navugate to the next page
