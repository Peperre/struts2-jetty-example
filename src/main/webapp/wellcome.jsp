<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<!DOCTYPE html>
<html>
<head>
  <title><s:text name="hello.message"/></title>
  <s:head/>
  <sx:head/>
</head>

<body>
    <h1>Resumen de factura: </h1>
    <p> Ha insertado la factura cuyo concepto es: <s:text name="invoiceBean.subject"/> por un importe de <s:text name="invoiceBean.amount"/> &euro;</p>
    <p> Se le ha aplicado un I.V.A del <s:text name="IVA"/> % con lo que el precio final es de <s:text name="invoiceBean.pricePlusIva"/> &euro;</p>
</body>
</html>