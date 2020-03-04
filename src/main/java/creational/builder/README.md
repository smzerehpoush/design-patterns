# Builder Pattern

## Definition

The Builder pattern can be used to ease the construction of a complex object
from simple objects. The Builder pattern also separates the construction of a
complex object from its representation so that the same construction process
can be used to create another composition of objects.
Related patterns include Abstract Factory and Composite.

## Where to use

•When the algorithm for creating a complex object should be independent of
the parts that make up the object and how they are assembled.

•When the construction process must allow different representations for the
object that is constructed.

•When you want to insulate clients from the knowledge of the actual
creation process and/or resulting product.

## Benefits
•The built object is shielded from the details of its construction.

•Code for construction is isolated from code for representation and both are
easy to replace without affecting the other.

•Gives you control over the construction process.

•Gives you the possibility to reuse and/or change the process and/or product
independently.

## Drawbacks/consequences

Need flexibility in creating various complex objects. Need to create complex,
aggregate objects