# Customer Information File (CIF)
## What Is a Customer Information File (CIF)?

A customer information file (CIF) is an electronic file that stores all pertinent information about a customer's personal and account information. The customer information file (CIF), which contains a CIF number, allows the business to view its customer accounts by relationship and not strictly by account type. Although many industries have customer files, CIFs have been traditionally associated with the banking industry. A CIF at a bank might include a client's credit relationships, accounts owned, and ownership information.

### Key Takeaways

- A customer information file (CIF) is a computerized file used by companies that store a customer's personal and account information.
- In banking, a CIF contains data such as credit relationships, account ownership information, the number, and types of accounts owned.
- Online retailers also create CIFs for current or potential customers based on their online product searches or purchases.

## How a Customer Information File (CIF) Works

The CIF for bank records such information as a customer's vital statistics account balances and transactions, and types of accounts held. It is updated as often as daily to ensure accuracy and is used to assist in various service and administrative functions.

A CIF provides the business with a summary of all of the activities associated with a particular customer. A CIF is more commonly held in an electronic format today along with its CIF number. However, a CIF paper folder often exists as well containing relevant documents such as signature cards used during the account opening process. The customer information file functions as a central point for examining customer data without having to look up each account or transaction individually.

Commercial banking uses CIFs to show the various credit products such as business loans and credit cards currently in use by a customer. The CIF may also display information regarding any previous inquiries, to help provide targeted information for the purpose of cross-selling, which is offering complementary products to existing clients.

### CIF and Data Security

Any business or entity that records certain customer information is required to disclose how it is collected and how it will be used. Also, the business is required to take certain minimum steps to protect the data from accidental or forced exposure by unauthorized parties.

The Federal Trade Commission helps to protect consumers and businesses by regulating how data is to be secured in the U.S. The FTC also provides help for companies on keeping data secure and ensuring that data is disposed of properly.

## Special Considerations

A customer information file (CIF) and its data are often used as a marketing tool. For example, a CIF with online retailers might include information on previous web searches, previously viewed products, and purchases. The search and browsing behavior helps online companies determine other items that might interest the customer to solicit new or additional sales.

Service providers also maintain CIFs for the purpose of future marketing. This can include notices to a consumer about services the consumer uses at specific intervals, such as vehicle maintenance or landscaping services. By gathering information on when service was last used, the company can anticipate when the customer may need it in the future and send a reminder.

## Example of a Customer Information File

A CIF often contains personally identifiable information (PII). This can include the customer’s name, address, and phone number for the purposes of fulfilling purchases. A CIF can also include a person's birth date and Social Security number, which is more often required in banking or in circumstances in which credit is relevant. Further information, such as race and gender, may also be included in the information is available.

## About This Project
This project expose a number of rest apis using spring-boot and uses spring-batch as its job
It is a multi module project as listed below:
- web : represnt a restful apis
- api : represnt an loosely coupled apis to provide a services based on Spring IoC and abstraction of implementing services 
- service : provide a required services for project 
- repository : provide a repository layer using JPA
- batch : Jobs using on Spring Batch

### Configuring database 
This project uses mariadb as its underlying database  
Download and install mariadb 
#### CREATE USER
````
$mysql -u root -p
CREATE DATABASE cifdb;
CREATE USER cif_user@localhost IDENTIFIED BY '123456';
SELECT user, host FROM mysql.user;
GRANT ALL PRIVILEGES ON cifdb.* TO cif_user@localhost;
SHOW GRANTS FOR cifdb@localhost;

CREATE USER cifdb@'%' IDENTIFIED BY '123456';
GRANT ALL PRIVILEGES ON cifdb.* TO cif_user@'%';
````

For quick setup and installation of database you can use command below:
```
docker run -p 3306:3306 -e MYSQL_ROOT_PASSWORD=123456 -e MYSQL_DATABASE=cifdb -e MYSQL_USER=cif_user -e MYSQL_PASSWORD=123456 mariadb
```