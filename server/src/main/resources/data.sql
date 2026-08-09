insert into products (product_id, name, brand, category, package_size, lactose_free, gluten_free, vegetarian, vegan) values
  (1, 'Trim Milk', 'Anchor', 'Dairy', '2L', true, false, true, true),
  (2, 'Original Mixed Grain Bread', 'Vogel''s', 'Bakery', '700g', false, true, true, true),
  (3, 'Baked Beans', 'Wattie''s', 'Pantry', '420g', false, true, true, true);

insert into stores (store_id, store_name, city, region, address) values
  (1, 'Woolworths Newmarket', 'Auckland', 'Auckland', 'Westfield Newmarket, 309 Broadway'),
  (2, 'PAK''nSAVE Mt Albert', 'Auckland', 'Auckland', '1164 New North Road'),
  (3, 'New World Victoria Park', 'Auckland', 'Auckland', '2 College Hill');


insert into store_prices (store_price_id, product_id, store_id, price) values
  (1, 1, 1, 4.59),
  (2, 1, 2, 4.39),
  (3, 1, 3, 4.79),
  (4, 2, 1, 6.49),
  (5, 3, 2, 2.89);