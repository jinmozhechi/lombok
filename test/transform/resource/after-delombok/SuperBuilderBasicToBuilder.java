import java.util.List;
public class SuperBuilderBasicToBuilder {
	public static class Parent {
		private int field1;
		int obtainViaField;
		int obtainViaMethod;
		String obtainViaStaticMethod;
		List<String> items;
		private int method() {
			return 2;
		}
		private static String staticMethod(Parent instance) {
			return "staticMethod";
		}
		@java.lang.SuppressWarnings("all")
		public static abstract class ParentBuilder<C extends Parent, B extends ParentBuilder<C, B>> {
			@java.lang.SuppressWarnings("all")
			private int field1;
			@java.lang.SuppressWarnings("all")
			private int obtainViaField;
			@java.lang.SuppressWarnings("all")
			private int obtainViaMethod;
			@java.lang.SuppressWarnings("all")
			private String obtainViaStaticMethod;
			@java.lang.SuppressWarnings("all")
			private java.util.ArrayList<String> items;
			@java.lang.SuppressWarnings("all")
			protected B $fillValuesFrom(final C instance) {
				ParentBuilder.$fillValuesFromInstanceIntoBuilder(instance, this);
				return self();
			}
			@java.lang.SuppressWarnings("all")
			private static void $fillValuesFromInstanceIntoBuilder(final Parent instance, final ParentBuilder<?, ?> b) {
				b.field1(instance.field1);
				b.obtainViaField(instance.field1);
				b.obtainViaMethod(instance.method());
				b.obtainViaStaticMethod(Parent.staticMethod(instance));
				b.items(instance.items == null ? java.util.Collections.emptyList() : instance.items);
			}
			@java.lang.SuppressWarnings("all")
			protected abstract B self();
			@java.lang.SuppressWarnings("all")
			public abstract C build();
			@java.lang.SuppressWarnings("all")
			public B field1(final int field1) {
				this.field1 = field1;
				return self();
			}
			@java.lang.SuppressWarnings("all")
			public B obtainViaField(final int obtainViaField) {
				this.obtainViaField = obtainViaField;
				return self();
			}
			@java.lang.SuppressWarnings("all")
			public B obtainViaMethod(final int obtainViaMethod) {
				this.obtainViaMethod = obtainViaMethod;
				return self();
			}
			@java.lang.SuppressWarnings("all")
			public B obtainViaStaticMethod(final String obtainViaStaticMethod) {
				this.obtainViaStaticMethod = obtainViaStaticMethod;
				return self();
			}
			@java.lang.SuppressWarnings("all")
			public B item(final String item) {
				if (this.items == null) this.items = new java.util.ArrayList<String>();
				this.items.add(item);
				return self();
			}
			@java.lang.SuppressWarnings("all")
			public B items(final java.util.Collection<? extends String> items) {
				if (this.items == null) this.items = new java.util.ArrayList<String>();
				this.items.addAll(items);
				return self();
			}
			@java.lang.SuppressWarnings("all")
			public B clearItems() {
				if (this.items != null) this.items.clear();
				return self();
			}
			@java.lang.Override
			@java.lang.SuppressWarnings("all")
			public java.lang.String toString() {
				return "SuperBuilderBasicToBuilder.Parent.ParentBuilder(field1=" + this.field1 + ", obtainViaField=" + this.obtainViaField + ", obtainViaMethod=" + this.obtainViaMethod + ", obtainViaStaticMethod=" + this.obtainViaStaticMethod + ", items=" + this.items + ")";
			}
		}
		@java.lang.SuppressWarnings("all")
		private static final class ParentBuilderImpl extends ParentBuilder<Parent, ParentBuilderImpl> {
			@java.lang.SuppressWarnings("all")
			private ParentBuilderImpl() {
			}
			@java.lang.Override
			@java.lang.SuppressWarnings("all")
			protected ParentBuilderImpl self() {
				return this;
			}
			@java.lang.Override
			@java.lang.SuppressWarnings("all")
			public Parent build() {
				return new Parent(this);
			}
		}
		@java.lang.SuppressWarnings("all")
		protected Parent(final ParentBuilder<?, ?> b) {
			this.field1 = b.field1;
			this.obtainViaField = b.obtainViaField;
			this.obtainViaMethod = b.obtainViaMethod;
			this.obtainViaStaticMethod = b.obtainViaStaticMethod;
			java.util.List<String> items;
			switch (b.items == null ? 0 : b.items.size()) {
			case 0: 
				items = java.util.Collections.emptyList();
				break;
			case 1: 
				items = java.util.Collections.singletonList(b.items.get(0));
				break;
			default: 
				items = java.util.Collections.unmodifiableList(new java.util.ArrayList<String>(b.items));
			}
			this.items = items;
		}
		@java.lang.SuppressWarnings("all")
		public static ParentBuilder<?, ?> builder() {
			return new ParentBuilderImpl();
		}
		@java.lang.SuppressWarnings("all")
		public ParentBuilder<?, ?> toBuilder() {
			return new ParentBuilderImpl().$fillValuesFrom(this);
		}
	}
	public static class Child extends Parent {
		private double field3;
		@java.lang.SuppressWarnings("all")
		public static abstract class ChildBuilder<C extends Child, B extends ChildBuilder<C, B>> extends Parent.ParentBuilder<C, B> {
			@java.lang.SuppressWarnings("all")
			private double field3;
			@java.lang.Override
			@java.lang.SuppressWarnings("all")
			protected B $fillValuesFrom(final C instance) {
				super.$fillValuesFrom(instance);
				ChildBuilder.$fillValuesFromInstanceIntoBuilder(instance, this);
				return self();
			}
			@java.lang.SuppressWarnings("all")
			private static void $fillValuesFromInstanceIntoBuilder(final Child instance, final ChildBuilder<?, ?> b) {
				b.field3(instance.field3);
			}
			@java.lang.Override
			@java.lang.SuppressWarnings("all")
			protected abstract B self();
			@java.lang.Override
			@java.lang.SuppressWarnings("all")
			public abstract C build();
			@java.lang.SuppressWarnings("all")
			public B field3(final double field3) {
				this.field3 = field3;
				return self();
			}
			@java.lang.Override
			@java.lang.SuppressWarnings("all")
			public java.lang.String toString() {
				return "SuperBuilderBasicToBuilder.Child.ChildBuilder(super=" + super.toString() + ", field3=" + this.field3 + ")";
			}
		}
		@java.lang.SuppressWarnings("all")
		private static final class ChildBuilderImpl extends ChildBuilder<Child, ChildBuilderImpl> {
			@java.lang.SuppressWarnings("all")
			private ChildBuilderImpl() {
			}
			@java.lang.Override
			@java.lang.SuppressWarnings("all")
			protected ChildBuilderImpl self() {
				return this;
			}
			@java.lang.Override
			@java.lang.SuppressWarnings("all")
			public Child build() {
				return new Child(this);
			}
		}
		@java.lang.SuppressWarnings("all")
		protected Child(final ChildBuilder<?, ?> b) {
			super(b);
			this.field3 = b.field3;
		}
		@java.lang.SuppressWarnings("all")
		public static ChildBuilder<?, ?> builder() {
			return new ChildBuilderImpl();
		}
		@java.lang.SuppressWarnings("all")
		public ChildBuilder<?, ?> toBuilder() {
			return new ChildBuilderImpl().$fillValuesFrom(this);
		}
	}
	public static void test() {
		Child x = Child.builder().field3(0.0).field1(5).item("").build().toBuilder().build();
	}
}
