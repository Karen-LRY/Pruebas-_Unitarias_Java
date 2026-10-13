# Documentación técnica: Cálculo de compras y descuentos

## 1. Descripción del problema
Este sistema calcula de manera automática el subtotal de una compra, valida si los datos ingresados son correctos, aplica un descuento del 10% si se alcanza el mínimo requerido y obtiene el precio final a pagar. Es muy importante verificar estos cálculos para evitar errores económicos que perjudiquen al cliente o al negocio.

## 2. Reglas de negocio
* *Subtotal:* Se obtiene multiplicando el precio unitario por la cantidad de artículos.
* *Validación:* Una compra solo es válida si tanto el precio como la cantidad son estrictamente mayores a cero.
* *Descuento:* Se aplica un 10% de descuento únicamente cuando el subtotal es igual o mayor a \$1,000 pesos mexicanos. Si es menor, no hay descuento (\$0).
* *Precio final:* Es el resultado de restar el descuento obtenido al subtotal de la compra.

## 3. Casos de prueba

| Método a probar | Datos de entrada | Resultado esperado | Resultado obtenido | Explicación del propósito |
| :--- | :--- | :--- | :--- | :--- |
| calculateSubtotal | Precio: 100.0, Cantidad: 3 | 300.0 | 300.0 | Comprueba una multiplicación estándar. |
| isValidPurchase | Precio: 0.0, Cantidad: 2 | false | false | Verifica que no se permitan precios en cero. |
| calculateDiscount | Subtotal: 1000.0 | 100.0 | 100.0 | Comprueba el límite exacto para la regla del descuento. |
| calculateFinalPrice| Subtotal: 1500.0 | 1350.0 | 1350.0 | Verifica la aplicación correcta del descuento sobre el subtotal. |

## 4. Resultados de ejecución
* *Pruebas totales ejecutadas:* 4 métodos principales con múltiples escenarios.
* *Pruebas exitosas (Passed):* 100% de las pruebas pasaron de manera correcta.
* *Pruebas fallidas (Failed):* 0.

## 5. Errores que se pueden prevenir
1. *Uso incorrecto de operadores relacionales:* Previene usar > en lugar de >= en el descuento, lo cual dejaría fuera a las compras de exactamente \$1,000.
2. *Cálculos con datos inválidos:* Previene procesar compras con cantidades en cero o negativas que alterarían los registros contables.

## 6. Conclusión
Las pruebas unitarias son fundamentales en el desarrollo de software ya que permiten comprobar de forma rápida y automatizada que la lógica básica del negocio funciona correctamente antes de desplegar o integrar código en sistemas reales de comercio electrónico.
