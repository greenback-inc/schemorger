schemorger (beta)
==========

SchemOrger is a Java Library for generating schema.org **hidden html snippets** for SEO and Rich Snippets. It will generate hidden schema.org metatags for your page.

It's really simple to use, like this:


```Java
Product product = new Product();
product.setName("simple product schemorger");

// rating
AggregateRating aggregateRating = new AggregateRating();
aggregateRating.setBestRating(5);
aggregateRating.setWorstRating(1);
aggregateRating.setRatingValue("4.5");
aggregateRating.setReviewCount(42.0);
product.setAggregateRating(aggregateRating);

// sku
product.setSku("42");

// releaseDate
product.setReleaseDate(new Date());

// brand
Brand brand = new Brand();
brand.setName("Texelz");
brand.setUrl(Link.toWiki("Texelz"));
brand.setLogo(Link.to("http://placehold.it/300&text=schemorger"));
product.setBrand(brand);

// url
product.setUrl(Link.to("http://www.texelz.com/schemorger"));

// image
product.setImage(Link.to("http://placehold.it/300&text=schemorger+product"));

// Offer
Offer offer = new Offer();
offer.setPrice(55.00);
ItemAvailability availability = new ItemAvailability();
availability.setUrl(Link.toSchema(Constants.InStock));
offer.setAvailability(availability);
product.setOffers(offer);

StringBuilder result = SchemaOrgBuilder.build(product);
```

and voilá, just place it on your page, [Check the RichSnippet Test Tool result](http://www.google.com/webmasters/tools/richsnippets?q=uploaded:8004f665794896136195354d47cb23b4)


```HTML
<div itemscope itemtype="http://schema.org/Product">
	<meta itemprop="releaseDate" content="2014-04-06T17:19"/>
	<meta itemprop="name" content="simple product schemorger"/>
	<div itemprop="offers" itemscope itemtype="http://schema.org/Offer">
		<meta itemprop="price" content="55.0"/>
		<link itemprop="availability" href="http://schema.org/InStock"/>
	</div>
	<div itemprop="brand" itemscope itemtype="http://schema.org/Brand">
		<link itemprop="logo" href="http://placehold.it/300&text=schemorger"/>
		<meta itemprop="name" content="Texelz"/>
		<link itemprop="url" href="http://pt.wikipedia.org/wiki/Texelz"/>
	</div>
	<link itemprop="image" href="http://placehold.it/300&text=schemorger+product"/>
	<div itemprop="aggregateRating" itemscope itemtype="http://schema.org/AggregateRating">
		<meta itemprop="ratingValue" content="4.5"/>
		<meta itemprop="reviewCount" content="42"/>
	</div>
	<meta itemprop="sku" content="42"/>
	<link itemprop="url" href="http://www.texelz.com/schemorger"/>
</div>
```

All objects in package ```org.schema``` are based on [schema.org schemas](http://schema.org/docs/full.html)


P.S.:
=====

It's still in development

Thanks.
