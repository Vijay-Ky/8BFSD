<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<title>Customer Confirmation</title>
</head>
<body>
The Customer is confirmed: ${customer.firstName} ${customer.lastName}

Free Passes: ${customer.freePasses}

Postal Code: ${customer.postalCode}
</body>
</html>