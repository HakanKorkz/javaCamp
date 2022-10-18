--Select
Select ContactName Adi,CompanyName Sirketadi,City Sehir from Customers
Select ContactName,CompanyName,City from Customers

Select*from Customers where City = 'Berlin'

case insensitive

sElEcT * from Products where CategoryID =1 or CategoryID=3

sElEcT * from Products where CategoryID =1 and UnitPrice<10

Select*from Products order by CategoryID, ProductName

Select*from Products order by UnitPrice desc

select count(*) adet from Products where CategoryID=2

select CategoryID, count(*)from Products where UnitPrice>20 group by CategoryID having Count(*)<10

select Products.ProductID,Products.	ProductName,Products.UnitPrice,Categories.CategoryName from  Products inner join Categories on Products.CategoryID = Categories.CategoryID
where Products.UnitPrice<10


--DTO Data Transformation object
select*from Products p left join [Order Details] od on p.ProductID=od.ProductID

Select* from Customers c left join Orders o on c.CustomerID= o.CustomerID 

select * from Customers c left join Orders o on c.CustomerID= o.CustomerID 
where o.CustomerID is null