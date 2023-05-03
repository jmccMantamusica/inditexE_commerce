# inditexE_commerce
TestJava2020

| BRAND_ID	|	 START_DATE 		| END_DATE				| PRICE_LIST| PRODUCT_ID| PRIORITY 	| PRICE | CURR|

| 1       	| 2020-06-14-00.00.00	| 2020-12-31-23.59.59 	| 1 		| 35455 	| 0 		| 35.50 | EUR |
| 1 		| 2020-06-14-15.00.00	| 2020-06-14-18.30.00 	| 2 		| 35455 	| 1 		| 25.45 | EUR |
| 1 		| 2020-06-15-00.00.00	| 2020-06-15-11.00.00 	| 3 		| 35455		| 1 		| 30.50 | EUR |
| 1 		| 2020-06-15-16.00.00	| 2020-12-31-23.59.59	| 4			| 35455 	| 1 		| 38.95 | EUR |

En la base de datos de comercio electrónico de la compañía disponemos de la tabla PRICES que refleja el precio final (pvp)
y la tarifa que aplica a un producto de una cadena entre unas fechas determinadas.


* BRAND_ID: foreign key de la cadena del grupo (1 = Zara).
* START_DATE , END_DATE: rango de fechas en el que aplica el precio tarifa indicado.
* PRICE_LIST: Identificador de la tarifa de precios aplicable.
* PRODUCT_ID: Identificador código de producto.
* PRIORITY: Desambiguador de aplicación de precios. Si dos tarifas coinciden en un rago de fechas se aplica la de mayor prioridad (mayor valor numérico).
* PRICE: precio final de venta.
* CURR: iso de la moneda.

Request:    - fecha de aplicación
            - identificador de producto
            - identificador de cadena.
Response:   - identificador de producto
            - identificador de cadena
            - tarifa a aplicar
            - fechas de aplicación
            - precio final a aplicar.
			
                                                                                       
- Test 1: petición a las 10:00 del día 14 del producto 35455   para la brand 1 (Zara)
- Test 2: petición a las 16:00 del día 14 del producto 35455   para la brand 1 (Zara)
- Test 3: petición a las 21:00 del día 14 del producto 35455   para la brand 1 (Zara)
- Test 4: petición a las 10:00 del día 15 del producto 35455   para la brand 1 (Zara)
- Test 5: petición a las 21:00 del día 16 del producto 35455   para la brand 1 (Zara)

La aplicación contiene OpenAPi para pruebas funcionales.
Se ha testeado al 83%.

Tenemos dos aplicaciones para el mismo ejercicio en Arquitectura Hexagonal (pendiente de acabar y en Arquitectura MVC)
